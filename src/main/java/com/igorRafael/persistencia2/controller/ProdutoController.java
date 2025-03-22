package com.igorRafael.persistencia2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.igorRafael.persistencia2.entity.Produto;
import com.igorRafael.persistencia2.service.TodosOsProdutos;

@Controller
@RequestMapping(value = "/web/produtos")
public class ProdutoController {
	
	@Autowired
	private TodosOsProdutos all;
	
     @GetMapping("/")
     public String view() {
    	 return "index";
     }
	
	
	@GetMapping("/produtos")
	public String todosProdutos(Model model){
		List<Produto> dados = all.findAllProdutos();
		 
		 model.addAttribute("dados", dados);
		 
		 return "result";
	}

	

}
