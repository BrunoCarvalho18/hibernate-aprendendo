package br.com.database.exemplo.testes;

import br.com.database.exemplo.model.Exemplo;
import br.com.database.exemplo.model.Produto;
import br.com.database.model.dao.ProdutoDAO;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		ProdutoDAO dao = new ProdutoDAO();
		
		Exemplo exemplo = new Exemplo();
		exemplo.setId(2);
		
		Produto produto = new Produto();
		produto.setDescricao("Arroz");
		produto.setQtd(10);
		produto.setValor(4.50);
		produto.setExemplo(exemplo);
		
		dao.save(produto);
	}

}
