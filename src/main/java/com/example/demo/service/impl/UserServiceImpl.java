package com.example.demo.service.impl;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDTO getUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Djay");
        return userDTO;
    }

    @Override
    public void createUser(UserDTO userDTO) {
        Person person = new Person();
        person.setName(userDTO.getName());

        personRepository.save(person);
    }
}
