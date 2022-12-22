package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class ParameterStoreTest {
    @Value("${spring.mysql.km0.username}")
    private String value;

    @Value("${test.key}")
    private String key;

    public void printProperties() {
        System.out.println("--------parameter store debug---------");
        System.out.println(value);
        System.out.println(key);
    }
}
