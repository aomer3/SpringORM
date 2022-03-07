package com.springORM.SpringORM.product.dao;

import java.util.List;

import com.springORM.SpringORM.product.entity.Product;

public interface ProductDao {

	void create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product find(int id);
	
	List<Product> findAll();
}
