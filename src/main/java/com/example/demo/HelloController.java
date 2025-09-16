package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test() {
        return "Hello All";
    }

    @GetMapping("/wellcome")
    public String wellcome() {
        return "Wellcome to Aws Lambda Spring Boot Application";
    }

    // API returning current system time
    @GetMapping("/time")
    public String time() {
        return "Current time (ms): " + System.currentTimeMillis();
    }

    // API returning JSON object automatically
    @GetMapping("/user")
    public User getUser() {
        return new User("Karishma", "Developer", "Canada");
    }

    // Nested static class for JSON response
    static class User {
        private String name;
        private String role;
        private String location;

        public User(String name, String role, String location) {
            this.name = name;
            this.role = role;
            this.location = location;
        }

        public String getName() { return name; }
        public String getRole() { return role; }
        public String getLocation() { return location; }
    }
}