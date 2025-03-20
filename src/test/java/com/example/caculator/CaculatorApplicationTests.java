package com.example.caculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class CaculatorApplicationTests { 

	private CalculatorService service = new CalculatorService();
	
	@Test
	void testSum() {
		System.out.println(service.sum(6,3));
		assertEquals(9, service.sum(6,3));
	}

}
