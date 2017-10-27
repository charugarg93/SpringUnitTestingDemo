package com.intuit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@Autowired Maths maths;

    @RequestMapping("/sum/{a}/{b}")
    public int doSum(@PathVariable int a, @PathVariable int b){
       return maths.sum(a,b);
    }
}
