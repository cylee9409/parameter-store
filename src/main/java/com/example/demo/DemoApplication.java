package com.example.demo;

import com.coveo.configuration.parameterstore.ParameterStorePropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${spring.mysql.km0.username}")
	private static String value;

	@Value("${test.key}")
	private static String key;

	public static void main(String[] args) {
		System.out.println("DemoApplication Start");
		
		System.out.println(value);
		System.out.println(key);

		SpringApplication.run(DemoApplication.class, args);
	}

}
