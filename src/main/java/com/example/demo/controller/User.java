package com.example.demo.controller;

import com.example.demo.entity.sql.Person;
import com.example.demo.exception.CustomException;
import com.example.demo.exception.ErrorResponse;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class User {
    @Autowired
    private  UserService userService;

    @Autowired
    private PersonRepository personRepository;



    @GetMapping("/get_user")
    public Person getUser() {

        return personRepository.findById(1L).orElse(new Person());
    }

    @PostMapping("create_user")
    public ResponseEntity<?> createUser(@RequestBody Person person, HttpServletRequest request) throws Exception , CustomException{
        try {
            Person personResponse = userService.createUser(person);
            return ResponseEntity.status(HttpStatus.CREATED).body(personResponse);
        } catch (Exception e) {
            ErrorResponse errorResponse = new ErrorResponse(
                    "Internal Server Errors",
                    HttpStatus.BAD_REQUEST.value(),
                    e.getMessage(),
                    request.getRequestURI()
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @PatchMapping("update_user/{Id}")
    public ResponseEntity<?> patchUser(@RequestBody Person person,@PathVariable String Id, HttpServletRequest request) throws Exception , CustomException{
        try {
            Person personResponse = userService.updateUser(person, Id);
            return ResponseEntity.status(HttpStatus.CREATED).body(personResponse);
        } catch (Exception e) {
            ErrorResponse errorResponse = new ErrorResponse(
                    "Internal Server Errors",
                    HttpStatus.BAD_REQUEST.value(),
                    e.getMessage(),
                    request.getRequestURI()
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

}
