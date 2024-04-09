package com.example.startSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StartSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootApplication.class, args);
	}

	@GetMapping(value ="/")
	public String doGetHelloWorld() {
		return "Hello World";
	}

	@GetMapping(value ="/demo")
	public String doGetHelloWorldDemo() {
		return "Hello World (Demo)";
	}
}
