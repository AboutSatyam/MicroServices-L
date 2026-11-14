package com.satyam._7redis_l.rest;

import com.satyam._7redis_l.model.Country;
import com.satyam._7redis_l.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CountryController {
    @Autowired
    private CountryService service;

    //    public CountryController(CountryService service) {
    //        this.service = service;
    //    }
    @PostMapping("/add-country")
    public String addCountry(@RequestBody Country country) {

        return service.addCountry(country);
    }

    @GetMapping("/get-country")
    public Collection<Object> getCountry() {

        return service.getAllCountries();
    }

}
