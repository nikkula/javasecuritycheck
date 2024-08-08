package com.example.SampleAdding.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddingController {
    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Sum of " + a + " and " + b + " is " + (a + b);
    }
    @GetMapping("/")
    public String ping(){
        return "ping"+System.currentTimeMillis();
    }

}
