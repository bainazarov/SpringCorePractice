package com.example.application;

import com.example.bean.MyBean;
import com.example.component.MyComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        MyComponent myComponent = context.getBean(MyComponent.class);

        myComponent.sayHello();
    }

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
