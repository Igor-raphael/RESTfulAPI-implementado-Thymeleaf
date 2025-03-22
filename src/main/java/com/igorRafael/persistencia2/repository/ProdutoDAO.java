package com.igorRafael.persistencia2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorRafael.persistencia2.entity.Produto;

public interface ProdutoDAO extends JpaRepository<Produto, Integer>{
	

}
