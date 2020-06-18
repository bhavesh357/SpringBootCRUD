package com.bl.crud.controller;


import com.bl.crud.model.Person;
import com.bl.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/products")
    public List<Person> list() {
        return service.listAll();
    }
}
