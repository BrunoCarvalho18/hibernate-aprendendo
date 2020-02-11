package br.com.database.exemplo.testes;

import br.com.database.exemplo.model.Exemplo;
import br.com.database.model.dao.ExemploDAO;

public class BuscarTodos {

	public static void main(String[] args) {
		
		ExemploDAO dao = new ExemploDAO();
		
		for(Exemplo e: dao.findAll()) {
			System.out.println("Descrição: "+ e.getDescricao());
		}
		
	}

}
