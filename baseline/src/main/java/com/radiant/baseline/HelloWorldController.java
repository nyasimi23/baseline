package com.radiant.baseline;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController  {
    
    @GetMapping("/hello")  
    public String HelloWorld(){
        return "Hello Jobu";
    }
}
