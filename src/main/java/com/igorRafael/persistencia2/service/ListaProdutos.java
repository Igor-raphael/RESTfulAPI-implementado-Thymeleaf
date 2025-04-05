package com.igorRafael.persistencia2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.igorRafael.persistencia2.entity.Produto;
import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class ListaProdutos {
	
	@Autowired
	ProdutoDAO dao;
	
	public String listaProdutos() {
		return "listaProdutos";
	}
	
	public List<Produto> findAll() {
		return dao.findAll();
	}

}
