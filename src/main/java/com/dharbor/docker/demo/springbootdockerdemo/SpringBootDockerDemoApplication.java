package com.dharbor.docker.demo.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerDemoApplication.class, args);
	}

	@RequestMapping("/health")
	public String health(){
		System.out.println("service is up");
		return "service is reachable -> UP";
	}



}
