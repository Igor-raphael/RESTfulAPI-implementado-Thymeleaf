package com.igorRafael.persistencia2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.igorRafael.persistencia2.entity.Produto;

@Service
public class DadosProdutos {
	
	// a pagina html sera dadosProdutos e o meio de acessar o novo objeto produto sera o "produtos"
	public ModelAndView dadosProdutos() {
		return new ModelAndView("dadosProdutos", "produto", new Produto());
		
	}

}
