package br.com.database.model.dao;

import javax.persistence.EntityManager;

import br.com.database.exemplo.connection.ConectionFactory;
import br.com.database.exemplo.model.Produto;

public class ProdutoDAO {
	
	public Produto save(Produto produto) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			
			em.getTransaction().begin();
			em.persist(produto);
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		
		return produto;
	}

}
