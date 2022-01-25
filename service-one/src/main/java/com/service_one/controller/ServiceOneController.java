package com.service_one.controller;

import com.service_one.domain.Model;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceOneController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{name}")
    public Model getData(@PathVariable String name){
        Model model = restTemplate.getForObject("http://s2:8086/" + name, Model.class);
        return model;
    }
}
