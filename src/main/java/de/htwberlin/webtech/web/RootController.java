package de.htwberlin.webtech.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String hello() {
        return "API is running!";
    }
}

