package com.igorRafael.persistencia2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorRafael.persistencia2.entity.Produto;
import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class AdicionarProduto {
	
	@Autowired
	ProdutoDAO dao;

	public String adicionar(Produto produto) {

		dao.save(produto);
		
		return "listaProdutos";
		
	}
	
	public List<Produto> findAll() {
		return dao.findAll();
	}
}
