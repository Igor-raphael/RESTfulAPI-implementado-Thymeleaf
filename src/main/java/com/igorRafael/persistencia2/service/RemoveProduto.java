package com.igorRafael.persistencia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class RemoveProduto {
	
	@Autowired
	private ProdutoDAO dao;
	
	public String removeProduto(Integer codigo) {
		
		ModelMap model = new ModelMap();
		
		dao.findById(codigo).ifPresentOrElse(ExistePorduto -> {
			
			dao.deleteById(codigo);
			model.addAttribute("produtos", dao.findAll());
			
		}, () -> {
			//CRIAR UM HANDLER PARA EXCECOES 
		});
		
		return "listaProdutos";
		
	}

}
