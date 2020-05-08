package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulappApplication.class, args);
	}

}
