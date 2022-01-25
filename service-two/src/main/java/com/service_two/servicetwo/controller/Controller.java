package com.service_two.servicetwo.controller;

import com.service_two.servicetwo.Entity.Person;
import com.service_two.servicetwo.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    private PersonRepo personRepo;

    @GetMapping("/{name}")
    public Person getPerson(@PathVariable String name){
        return personRepo.findPersonByName(name);
    }

    @PostMapping("/save")
    public String savePerson(@RequestBody Person person){
        Person person1 = new Person(person.getId(),person.getName(),person.getAge(),person.getGender());
        personRepo.save(person1);
        return "Success";
    }
}
