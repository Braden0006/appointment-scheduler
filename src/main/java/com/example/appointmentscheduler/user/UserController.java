package com.example.appointmentscheduler.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    private static final String template = "Hello, %s!!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user")
    public User user(@RequestParam(defaultValue = "World") String name) {
        return new User(counter.incrementAndGet(), template.formatted(name));
    }
}
