package com.example.validation.controller;

import com.example.validation.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.ResponseEntity.ok;

@RestController()
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ok("Application is up");
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validate(@Valid @RequestBody UserDto user) {
        log.info("User validated: " + user);
        return ok("Validation passed");
    }

}
