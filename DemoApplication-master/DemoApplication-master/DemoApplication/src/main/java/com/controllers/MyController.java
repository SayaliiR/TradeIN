package com.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.MyService;

@RestController
public class MyController {

	@Autowired
	MyService service;

	@GetMapping("/orders")
	public List<String> getOrders() {
		return service.findAllOrders();
	}

	@GetMapping("/orders/{name}")
	public List<String> getOrders(String name) {
		return service.findAllOrdersByName(name);
	}
}
