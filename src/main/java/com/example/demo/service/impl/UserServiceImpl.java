package com.example.demo.service.impl;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.mongo.Human;
import com.example.demo.entity.sql.Person;
import com.example.demo.repository.HumanMongoDBRepository;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private HumanMongoDBRepository humanMongoDBRepository;

    @Override
    public UserDTO getUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Djay");
        return userDTO;
    }

    @Override
    public Person createUser(Person personRequest) {
        Person person = new Person();
        person.setName(personRequest.getName());
        person.setPhone(personRequest.getPhone());
        personRepository.save(person);


        Human human = new Human();
//        human.setId(String.valueOf(ObjectId.get()));
        human.setPhone(personRequest.getPhone());
        human.setName(personRequest.getName());
        humanMongoDBRepository.save(human);
        return person;
    }

    @Override
    public Person updateUser(Person person, String Id)  throws EmptyResultDataAccessException {
        Person personExist = personRepository.findById(Long.valueOf(Id)).orElseThrow(() -> new EmptyResultDataAccessException("data not found", 1));
        personExist.setPhone(person.getPhone());
        personRepository.save(personExist);
        return  personExist;
    }
}
