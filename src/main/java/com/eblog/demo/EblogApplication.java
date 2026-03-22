package com.eblog.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication		//annotation triggers the auto-configuration of Spring and scans for components in the com.eblog.demo package.
public class EblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(EblogApplication.class, args);
	}

}
