package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ParameterStoreTest implements InitializingBean {
    @Value("${spring.mysql.km0.username}")
    private String username;

    @Value("${spring.mysql.km0.password}")
    private String password;

    @Value("${test.key}")
    private String key;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("key : " + key);
    }
}
