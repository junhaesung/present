package com.depromeet.present.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {
    @GetMapping("/l7check")
    public String checkHealth() {
        return "OK";
    }
}
