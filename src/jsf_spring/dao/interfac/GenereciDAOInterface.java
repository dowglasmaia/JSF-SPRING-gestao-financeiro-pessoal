package jsf_spring.dao.interfac;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface GenereciDAOInterface<E> extends Serializable {
	
	E save(E obj);

	E update(E obj);

	void delete(Long id);

	E findById(Long id);

	List<E> FindAll();

	List<E> findByName(String nome);

	List<E> findByDate(LocalDate entrada, LocalDate saida);

}
