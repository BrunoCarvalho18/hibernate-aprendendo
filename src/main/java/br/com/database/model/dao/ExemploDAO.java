package br.com.database.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import br.com.database.exemplo.connection.ConectionFactory;
import br.com.database.exemplo.model.Exemplo;

public class ExemploDAO {

	public Exemplo save(Exemplo exemplo) {
		EntityManager em = new ConectionFactory().getConnection();

		try {
			em.getTransaction().begin();
			if (exemplo.getId() == null) {
				em.persist(exemplo);
			} else {
				em.merge(em);
			}
			em.persist(exemplo);
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();

		} finally {
			em.close();

		}
		return exemplo;

	}
	
	
	public Exemplo findById(Integer id) {
		EntityManager em = new ConectionFactory().getConnection();
		Exemplo exemplo = null;
		
		try {
			exemplo = em.find(Exemplo.class, id);
		} catch (Exception e) {
			System.err.println(e);
		}finally {
		}
		
		return exemplo;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Exemplo> findAll(){
		EntityManager em = new ConectionFactory().getConnection();
		List<Exemplo> exemplo= null;
		
		try {
			exemplo = em.createQuery("from Exemplo").getResultList();
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return exemplo;
		
	}
	
	public Exemplo remove(Integer id) {
		
		EntityManager em = new ConectionFactory().getConnection(); 
		Exemplo exemplo = null;
		
		try {
			
			exemplo = em.find(Exemplo.class, id);
			em.getTransaction().begin();
			em.remove(exemplo);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return exemplo;
		
	}
}