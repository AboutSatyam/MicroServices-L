package com.satyam._4microserv2.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoContoller {

    @GetMapping("/course-info")
    public ResponseEntity<String> getCourseInfo() {

        String info = "Telusko Has Best Eduactor For Java ";
        return new ResponseEntity<>(info, HttpStatus.OK);
    }

}
