package br.com.database.exemplo.testes;

import br.com.database.exemplo.model.Exemplo;
import br.com.database.model.dao.ExemploDAO;

public class BuscarPorId {
	
	public static void main(String[] args) {
		
		
		ExemploDAO dao = new ExemploDAO();
		
		Exemplo e = dao.findById(4);
		
		System.out.println("Descrição: "+e.getDescricao());
	}

}
