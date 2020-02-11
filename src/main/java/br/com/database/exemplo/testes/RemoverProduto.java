package br.com.database.exemplo.testes;

import br.com.database.model.dao.ExemploDAO;

public class RemoverProduto {
	
	public static void main(String[] args) {
		
		ExemploDAO dao = new ExemploDAO();
		
		dao.remove(2);
	}

}
