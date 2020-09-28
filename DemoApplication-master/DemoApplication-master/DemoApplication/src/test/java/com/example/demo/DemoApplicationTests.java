package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.MyDAO;
import com.service.MyService;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	@Autowired
	//MyService service;
	
//	@Test
//	public void testFindAllOrders() {
		
//		List<String> orders=service.findAllOrders();
		
//		assertEquals(4,orders.size());
//		assertEquals("A",orders.get(0));
		
//	}

	@Mock
	MyDAO dao;
	
	@InjectMocks
	MyService service;
	
	
	@Test
	public void testDAO() {
		
	when(dao.getOrders()).thenReturn(Arrays.asList("a","b","c"));	
		
		List<String> list = dao.getOrders();
		assertEquals(3, list.size());
	}

	@Test
	public void testService() {
		
	when(dao.getOrders()).thenReturn(Arrays.asList("a","b","c"));	
		
		List<String> list = service.findAllOrders();
		assertEquals(3, list.size());
		assertEquals("B", list.get(1));
	}

}
