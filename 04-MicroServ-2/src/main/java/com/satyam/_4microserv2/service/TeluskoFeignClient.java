package com.satyam._4microserv2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
@Component

@FeignClient(name = "03-MICROSERV-1")
public interface TeluskoFeignClient {

    @GetMapping("/course-info")
    public ResponseEntity<String> getCourseInfo();


}