package jsf_spring.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public class JPAUtil {
	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("jsf_spring");
	}

	public static EntityManager getEntmanager() {
		return factory.createEntityManager();
	}

	public static void close() {
		factory.close();
	}

}
