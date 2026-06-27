package com.example.appointmentscheduler.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

//    private static final String template = "Hello, %s!!";
    private final AtomicLong counter = new AtomicLong();

    private static final String name = "Braden";

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User user() {
        return new User(counter.incrementAndGet(), userService.greetUser(name));
    }
//    public String greet() {
//        return userService.greetUser(name);
//    }
}
