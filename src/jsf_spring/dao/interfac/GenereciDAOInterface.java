package jsf_spring.dao.interfac;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GenereciDAOInterface<E> extends Serializable {
	
	void save(E obj);

	void update(E obj);

	void delete(Long id);

	E findById(Long id);

	List<E> FindAll();

	List<E> findByName(String nome);

	List<E> findByDate(LocalDate entrada, LocalDate saida);

}
