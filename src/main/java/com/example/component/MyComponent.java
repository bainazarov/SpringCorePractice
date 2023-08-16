package com.example.component;

import com.example.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Autowired
    private MyBean myBean;

    public void sayHello() {
        System.out.println("Hello from MyComponent");
        myBean.sayHello();
    }
}
