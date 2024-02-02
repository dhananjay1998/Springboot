package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class User {
    @Autowired
    private  UserService userService;

    @Autowired
    private PersonRepository personRepository;



    @GetMapping("/get_user")
    public Person getUser() {
        Person person = personRepository.findById(1L).orElse(new Person());

        return  person;
    }

    @PostMapping("create_user")
    public void createUser(@RequestBody UserDTO userDTO) {
        userService.createUser(userDTO);
    }

}
