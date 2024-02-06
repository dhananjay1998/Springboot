package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.sql.Person;

public interface UserService {
    UserDTO getUser();

    Person createUser(Person person);

    Person updateUser(Person person, String Id);
}
