package com.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SampleController {
	
	@RequestMapping("/hi")
	public String helloWorld() {
		return "Hello this is the first RestAPI of spring";
		
	}
	


	public static void main(String[] args) {
		
			SpringApplication.run(SampleController.class, args);
		}

	}



