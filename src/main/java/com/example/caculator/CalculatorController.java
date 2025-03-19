package com.example.caculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@Autowired
	private CalculatorService service;
	
	@RequestMapping("/sum")
	public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(service.sum(a, b));
	}
}
