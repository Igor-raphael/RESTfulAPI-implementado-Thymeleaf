package com.igorRafael.persistencia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class ListaProdutos {
	
	@Autowired
	ProdutoDAO dao;
	
	public String listaProdutos() {
		
		ModelMap model = new ModelMap();
		
		model.addAttribute("produtos", dao.findAll());
		
		return "listaProdutos";
	}

}
