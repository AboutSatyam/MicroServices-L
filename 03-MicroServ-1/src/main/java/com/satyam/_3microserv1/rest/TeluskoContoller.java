package com.satyam._3microserv1.rest;

import com.satyam._4microserv2.service.TeluskoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoContoller {


    @GetMapping("/course-info")
    public ResponseEntity<String> getCourseInfo() {

        String info = "Telusko Has Best Eduactor For Devops APP1 ";
        return new ResponseEntity<>(info, HttpStatus.OK);
    }

}
