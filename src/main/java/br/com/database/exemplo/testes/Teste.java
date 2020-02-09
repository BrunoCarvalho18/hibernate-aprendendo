package br.com.database.exemplo.testes;

import br.com.database.exemplo.model.Exemplo;
import br.com.database.model.dao.ExemploDAO;

public class Teste {
	
	public static void main(String[] args) {
		
		Exemplo ex = new Exemplo();
		ex.setDescricao("Comidas");
		
		
		ExemploDAO dao = new ExemploDAO();
		ex= dao.save(ex);
		
	}

}
