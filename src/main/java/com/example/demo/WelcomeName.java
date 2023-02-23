package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeName{
	    String studentName = "Ajay";
	    @GetMapping("/")
	    public String getName(){
	        return "Welcome "+studentName+"!";
	    }
}