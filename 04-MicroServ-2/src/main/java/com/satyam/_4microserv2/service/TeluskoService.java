package com.satyam._4microserv2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TeluskoService {
    @Autowired
    private TeluskoFeignClient feignClient;


    public String getCourseInfo() {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8481/course-info", String.class);

//        return response.getBody() + " APP2 Coming From a Another RestApi ";

        ResponseEntity<String> response = feignClient.getCourseInfo();
        return response.getBody() + "Coming FROm OTHERRRRRRR RestAPI ";

    }
}
