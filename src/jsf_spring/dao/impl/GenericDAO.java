package jsf_spring.dao.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import jsf_spring.dao.interfac.GenereciDAOInterface;

@Repository
public class GenericDAO<E> implements GenereciDAOInterface<E> {
	private static final long serialVersionUID = 1L;

	@Override
	public void save(E obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(E obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> findByName(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> findByDate(LocalDate entrada, LocalDate saida) {
		// TODO Auto-generated method stub
		return null;
	}

}
