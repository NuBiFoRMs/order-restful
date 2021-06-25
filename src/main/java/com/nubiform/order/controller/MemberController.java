package com.nubiform.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/api/v1/members")
    public void getMembers() {

    }

    @GetMapping("/api/v1/members/{id}")
    public void getMember(@PathVariable int id) {

    }
}
