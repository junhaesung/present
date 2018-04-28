package com.depromeet.present.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {
    @RequestMapping("/l7check")
    public String checkHealth() {
        return "OK";
    }
}
