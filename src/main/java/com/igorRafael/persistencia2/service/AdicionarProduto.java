package com.igorRafael.persistencia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.igorRafael.persistencia2.entity.Produto;
import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class AdicionarProduto {
	
	@Autowired
	ProdutoDAO dao;

	public String adicionar(Produto produto) {
		ModelMap model = new ModelMap();
		
		dao.save(produto);
		
		model.addAttribute("produtos", dao.findAll());
		
		return "listaProdutos";
		
	}
}
