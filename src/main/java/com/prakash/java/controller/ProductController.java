package com.prakash.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/products")
public class ProductController {

	@RequestMapping(method = RequestMethod.GET)
	private void getAllProducts() {
		System.out.println("In controller class - getAllProducts method");
	}
}
