package com.igorRafael.persistencia2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorRafael.persistencia2.entity.Produto;
import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class RemoveProduto {
	
	@Autowired
	private ProdutoDAO dao;
	
	public String removeProduto(Integer codigo) {	
		
		dao.findById(codigo).ifPresentOrElse(ExistePorduto -> {
			
			dao.deleteById(codigo);
			
		}, () -> {
			//CRIAR UM HANDLER PARA EXCECOES 
		});
		
		return "listaProdutos";
		
	}

	public List<Produto> findAll() {
		return dao.findAll();
	}
	
}
