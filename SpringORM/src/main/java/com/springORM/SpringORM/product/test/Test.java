package com.springORM.SpringORM.product.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.SpringORM.product.dao.ProductDao;
import com.springORM.SpringORM.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springORM/SpringORM/product/test/config.xml");
		ProductDao dao = (ProductDao) context.getBean("dao");
		
		Product product = new Product();
		product.setId(4);
		product.setName("bike");
		product.setDesc("a nice bike");
		product.setPrice(340.00);
		
		//dao.create(product);
		//dao.update(product);
		//dao.delete(product);
		//Product prod = dao.find(3);
		List<Product> products = dao.findAll();
		System.out.println(products);
	}

}
