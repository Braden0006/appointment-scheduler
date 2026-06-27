package com.example.appointmentscheduler.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String greetUser(String name) {
        return "Hello" + name + "!!";
    }
}
