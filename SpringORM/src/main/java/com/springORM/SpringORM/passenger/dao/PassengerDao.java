package com.springORM.SpringORM.passenger.dao;

import java.util.List;

import com.springORM.SpringORM.passenger.entity.Passenger;

public interface PassengerDao {
	
	void create(Passenger passenger);
	
	void update(Passenger passenger);
	
	void delete(Passenger passenger);
	
	Passenger find(int id);
	
	List<Passenger> findAll();

}
