package com.nubiform.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/api/v1/sign-up")
    public void signUp() {

    }

    @PostMapping("/api/v1/sign-in")
    public void signIn() {

    }

    @PostMapping("/api/v1/sign-out")
    public void signOut() {

    }
}
