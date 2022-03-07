package com.springORM.SpringORM.passenger.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.SpringORM.passenger.dao.PassengerDao;
import com.springORM.SpringORM.passenger.entity.Passenger;
import com.springORM.SpringORM.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springORM/SpringORM/passenger/test/config.xml");
		PassengerDao dao = (PassengerDao) context.getBean("dao");
		
		Passenger passenger = new Passenger();
		passenger.setId(6);
		passenger.setFirstName("Professor");
		passenger.setLastName("Clark");
		
		//dao.create(passenger);
		//dao.update(passenger);
		//dao.delete(passenger);
		//Passenger passenger2 = dao.find(5);
		List<Passenger> passengers = dao.findAll();
		System.out.println(passengers);
	}

}
