package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${/io-back/km0/username}")
	private static String value;

	public static void main(String[] args) {
		System.out.println("DemoApplication Start");

		System.out.println(value);

		SpringApplication.run(DemoApplication.class, args);
	}

}
