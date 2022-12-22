package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ParameterStoreTest {
    @Value("${spring.mysql.km0.username}")
    private String value;

    @Value("${test.key}")
    private String key;

    @Test
    public void printProperties() {
        System.out.println("--------parameter store debug---------");
        System.out.println(value);
        System.out.println(key);
    }
}
