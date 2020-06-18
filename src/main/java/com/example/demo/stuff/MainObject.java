package com.example.demo.stuff;

import org.springframework.stereotype.Component;

@Component
public class MainObject {

    private final SomeObject someObject;

    public MainObject(SomeObject someObject) {
        this.someObject = someObject;
    }
}
