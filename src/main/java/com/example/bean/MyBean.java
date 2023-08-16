package com.example.bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyBean {

    public void sayHello() {
        System.out.println("Hello from MyBean");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method");
    }

}
