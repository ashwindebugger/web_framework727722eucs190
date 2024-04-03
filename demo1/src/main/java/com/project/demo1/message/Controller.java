package com.project.demo1.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//used as we use rest control api
public class Controller {
    @GetMapping("/welcome")
    public String message()
    {
        return "Welcome Spring boot!";
    }
}