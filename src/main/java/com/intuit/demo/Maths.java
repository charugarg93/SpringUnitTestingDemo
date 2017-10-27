package com.intuit.demo;

import org.springframework.stereotype.Repository;

@Repository
public class Maths {

    public int sum(int a, int b) {
        return (a+b);
    }
}
