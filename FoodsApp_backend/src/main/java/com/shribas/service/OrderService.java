package com.shribas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shribas.model.Order;
import com.shribas.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orepo;
	public void addData(Order o) {
		orepo.save(o);
	}
	public List billing() {
		return orepo.billing();
	}
}
