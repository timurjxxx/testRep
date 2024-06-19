package com.security.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/security")
public class Controller {

    @GetMapping
    public ResponseEntity<String > getResponse(){
        return ResponseEntity.ok("200 OK");
    }
}
