package com.example.cli;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public void helloCli(String processname) {
        System.out.println("hello "+processname);
    }
}
