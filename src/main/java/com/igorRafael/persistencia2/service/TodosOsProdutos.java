package com.igorRafael.persistencia2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorRafael.persistencia2.entity.Produto;
import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class TodosOsProdutos {

	
	@Autowired
	private ProdutoDAO dao;
	
	public List<Produto> findAllProdutos(){
		
		List<Produto> result = dao.findAll();
		
		return result;
		
	}
	

}
