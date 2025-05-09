package com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // This annotation determines or finds which is in charge to solve a specific request
public class MainController {

    @GetMapping("/")
    public String crazyName() {
        return "hello"; // return value determines the output result for the server
    }
}
