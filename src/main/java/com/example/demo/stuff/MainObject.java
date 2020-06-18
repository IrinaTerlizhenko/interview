package com.example.demo.stuff;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MainObject {

    private SomeObject someObject;

    public MainObject(SomeObject someObject) {
        this.someObject = someObject;
    }

    @PostConstruct
    public void m()
    {
        System.out.println(someObject);
    }
}
