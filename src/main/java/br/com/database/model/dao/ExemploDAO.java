package br.com.database.model.dao;

import javax.persistence.EntityManager;
import br.com.database.exemplo.connection.ConectionFactory;
import br.com.database.exemplo.model.Exemplo;

public class ExemploDAO {
	
	public Exemplo save(Exemplo exemplo) {
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(exemplo);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			
		}finally {
			em.close();
		
	}
		return exemplo;

}
}