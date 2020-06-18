package com.example.demo.stuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeObject {

    @Autowired
    private AnotherObject anotherObject;
}
