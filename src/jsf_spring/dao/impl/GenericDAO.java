package jsf_spring.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import jsf_spring.dao.interfac.GenereciDAOInterface;

public class GenericDAO<E> implements GenereciDAOInterface<E> {
	private static final long serialVersionUID = 1L;
	/*
	 * @PersistenceContext private EntityManager entityManager;
	 * 
	 * protected EntityManager getEntityManager() { return entityManager; }
	 */
	// Metodo auxilar para Consultas Genericas, Recuperando a Class de Instancia
	@SuppressWarnings({ "unused", "unchecked" })
	private final Class<E> entidadeClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];

	/* salvar */
	@Override
	public E save(E obj) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jsf_spring");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		manager.persist(obj);
		manager.flush();

		manager.getTransaction().commit();
		manager.close();

		return obj;

	}

	@Override
	public E update(E obj) {
		return obj;

	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public E findById(Long id) {

		return null;
	}

	@Override
	public List<E> FindAll() {

		return null;
	}

	@Override
	public List<E> findByName(String nome) {

		return null;
	}

	@Override
	public List<E> findByDate(LocalDate entrada, LocalDate saida) {

		return null;
	}

}
