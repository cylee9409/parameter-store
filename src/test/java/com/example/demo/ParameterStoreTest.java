package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class ParameterStoreTest {
    @Value("${spring.mysql.km0.username}")
    private String value;

    @Value("${test.key}")
    private String key;


}
