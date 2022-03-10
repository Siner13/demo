package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public ResponseEntity<String> getLessons(){
        return new ResponseEntity<>("Hello my first lessons", HttpStatus.OK);

    }
}
