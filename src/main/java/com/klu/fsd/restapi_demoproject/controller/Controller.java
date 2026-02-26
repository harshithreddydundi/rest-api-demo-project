package com.klu.fsd.restapi_demoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.klu.fsd.restapi_demoproject.bean.User;

@RestController
public class Controller {

    // API 1
    @GetMapping("/users")
    public String getUser() {
        return "Welcome to spring boot rest API with DB Interaction";
    }

    // API 2
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {

        User user = new User();
        user.setId(id);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");

        return user;
    }
}
