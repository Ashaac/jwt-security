package com.security.jwtsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class MainController {

    @GetMapping
    public String auth() {
        return "Authorised";
    }
}
