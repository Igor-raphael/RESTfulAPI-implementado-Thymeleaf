package com.igorRafael.persistencia2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer codigo;
	
	private String nome;
	private Integer quantidade;

	
	public Produto() {
	}
	
	public Produto(Integer codigo, String nome, Integer quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
	}

	
	public Integer getId() {
		return codigo;
	}

	public void setId(Integer id) {
		this.codigo = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}
