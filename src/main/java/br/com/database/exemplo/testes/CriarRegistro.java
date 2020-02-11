package br.com.database.exemplo.testes;

import br.com.database.exemplo.model.Exemplo;
import br.com.database.model.dao.ExemploDAO;

public class CriarRegistro {
	
	public static void main(String[] args) {
		
		Exemplo ex = new Exemplo();
		ex.setDescricao("Arroz");
		
		
		ExemploDAO dao = new ExemploDAO();
		ex= dao.save(ex);
		
	}

}
