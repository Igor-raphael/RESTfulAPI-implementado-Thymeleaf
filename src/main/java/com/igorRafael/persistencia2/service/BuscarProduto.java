package com.igorRafael.persistencia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.igorRafael.persistencia2.repository.ProdutoDAO;

@Service
public class BuscarProduto {
	
	@Autowired
	ProdutoDAO dao;
	
	public ModelAndView busca(Integer codigo) {
		return new ModelAndView("dadosProdutos", "produto", dao.findById(codigo));
	}

}
