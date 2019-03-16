package jsf_spring.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import jsf_spring.dao.interfac.GenereciDAOInterface;
import jsf_spring.util.JPAUtil;

public class GenericDAO<E> implements GenereciDAOInterface<E> {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	
	public GenericDAO() {
		this.manager = JPAUtil.getEntmanager();
	}

	// Metodo auxilar para Consultas Genericas, Recuperando a Class de Instancia
	@SuppressWarnings({ "unused", "unchecked" })
	private final Class<E> entidadeClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];

	/* salvar */
	@Override
	public E save(E obj) {
		this.manager.getTransaction().begin();
		this.manager.persist(obj);
		this.manager.flush();
		this.manager.getTransaction().commit();
		this.manager.close();
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
