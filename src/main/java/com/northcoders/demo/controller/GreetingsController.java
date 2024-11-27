package com.northcoders.demo.controller;

import com.northcoders.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1") // adds to the URL
public class GreetingsController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Everyone!";
    }

    Person person = new Person("Tawa", "testing@testing.co.uk", 21);

    // Automatically serialised into a JSON object by the Jackson library package.
    @GetMapping("/person")
    public Person getPerson(){
        return person;
    }
}
