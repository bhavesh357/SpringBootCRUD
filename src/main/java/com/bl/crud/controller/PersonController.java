package com.bl.crud.controller;


import com.bl.crud.model.Person;
import com.bl.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/persons")
    public List<Person> list() {
        return service.listAll();
    }

    @GetMapping("/persons/{id}")
    public ResponseEntity<Person> get(@PathVariable Integer id) {
        try {
            Person person = service.get(id);
            return new ResponseEntity<Person>(person, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/persons")
    public void add(@RequestBody Person person) {
        service.save(person);
    }
}
