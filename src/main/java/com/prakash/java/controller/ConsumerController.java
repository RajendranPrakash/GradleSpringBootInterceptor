package com.prakash.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prakash.rajendran
 *
 */
@RestController
@RequestMapping(value="/consumers")
public class ConsumerController {

	@RequestMapping(method = RequestMethod.GET)
	private void getAllConsumers() {
		System.out.println("In Consumer controller class - getAllConsumers method");
	}
}
