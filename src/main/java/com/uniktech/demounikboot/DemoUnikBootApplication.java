package com.uniktech.demounikboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoUnikBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoUnikBootApplication.class, args);
	}

	@Value("${app.name}")
	private String appName;

	@Value("${app.version}")
	private String appVersion;

	@GetMapping
	public String appStatus(){
		return new StringBuilder().append(appName).append("-").append(appVersion).append(" running..!!").toString();
	}

	@GetMapping("/greet/{name}")
	public String greeting(@PathVariable("name") String name){
		return new StringBuilder().append("Hi ").append(name).append(", Welcome to uniktech demo").toString();
	}

}
