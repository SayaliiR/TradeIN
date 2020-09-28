package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyDAO;

@Service
public class MyService {

	@Autowired
	MyDAO dao;

	public List<String> findAllOrders() {
		List<String> order1 = new ArrayList<>();
		List<String> orders = dao.getOrders();
		for (String name : orders) {
			order1.add(name.toUpperCase());
		}

		return order1;
	}

	public List<String> findAllOrdersByName(String name) {

		List<String> orders = new ArrayList<>();
		List<String> orders1 = dao.getOrders(name);
		for (String n : orders) {
			if (name.startsWith("o"))
				orders.add(n);
		}
		return orders;
	}

}
