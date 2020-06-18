package com.bl.crud.service;

import com.bl.crud.model.Person;
import com.bl.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository repo;

    public List<Person> listAll(){
        return repo.findAll();
    }
}
