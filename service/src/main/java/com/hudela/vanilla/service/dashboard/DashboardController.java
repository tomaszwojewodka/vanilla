package com.hudela.vanilla.service.dashboard;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DashboardController {
    @GetMapping(path = "/message")
    public ResponseEntity<String> message() {
        return new ResponseEntity<>("ENABLED", HttpStatus.OK);
    }
}
