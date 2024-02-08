package com.springjavatech.jenkins.api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);

@PostConstruct
private void intt() {
	logger.info("Application Started");
	// TODO Auto-generated method stub

}
	public static void main(String[] args) {
		logger.info("Application excecuted");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
