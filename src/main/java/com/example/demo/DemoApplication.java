package com.example.demo;

import com.coveo.configuration.parameterstore.ParameterStorePropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		System.out.println("DemoApplication Start");
		ParameterStoreTest test = new ParameterStoreTest();
		test.printProperties();
		SpringApplication.run(DemoApplication.class, args);
	}

}
