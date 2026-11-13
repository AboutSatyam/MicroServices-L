package com.satyam._4microserv2.rest;

import com.satyam._4microserv2.service.TeluskoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoContoller {

    @Autowired
    private TeluskoService service;

    @GetMapping("/course-details")
    public ResponseEntity<String> getCourseInfo() {
        String info = service.getCourseInfo();
        return new ResponseEntity<>(info, HttpStatus.OK);
    }

}
