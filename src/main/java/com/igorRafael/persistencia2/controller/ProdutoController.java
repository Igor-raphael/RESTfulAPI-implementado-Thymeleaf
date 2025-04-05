package com.igorRafael.persistencia2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.igorRafael.persistencia2.entity.Produto;
import com.igorRafael.persistencia2.service.AdicionarProduto;
import com.igorRafael.persistencia2.service.BuscarProduto;
import com.igorRafael.persistencia2.service.DadosProdutos;
import com.igorRafael.persistencia2.service.ListaProdutos;
import com.igorRafael.persistencia2.service.RemoveProduto;

@Controller
@RequestMapping(value = "/web/produtos")
public class ProdutoController {
	
	@Autowired
	private DadosProdutos data;
	
	@Autowired
	private ListaProdutos list;
	
	@Autowired
	private BuscarProduto search;
	
	@Autowired
	private RemoveProduto delete;
	
	@Autowired
	private AdicionarProduto add;
	
	
	
	@GetMapping("/dadosProduto")
	public ModelAndView dadosProdutos() {
		return data.dadosProdutos();
	}
	
	@GetMapping("/listaProdutos")
	public String listaProdutos(ModelMap model) {
		model.addAttribute("produtos", list.findAll());
		return list.listaProdutos();
	}
	
	@GetMapping("/dadosProduto/{codigo}")
	public ModelAndView buscaProduto(@PathVariable("codigo") Integer codigo) {
		return search.busca(codigo);
	}
	
	
	
	@PostMapping("novoProduto")
	public String novoProduto(@RequestBody Produto produto, ModelMap model) {
		
		model.addAttribute("produtos", add.findAll());
		
		return add.adicionar(produto);
	}
	
	
	
	@DeleteMapping("/removerProduto/{codigo}")
	public String removerProduto(@PathVariable("codigo") Integer codigo, ModelMap model) {
		
		model.addAttribute("produtos", delete.findAll());
		
		return delete.removeProduto(codigo);
	}
    
}
