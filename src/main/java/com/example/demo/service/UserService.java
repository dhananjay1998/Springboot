package com.example.demo.service;

import com.example.demo.controller.User;
import com.example.demo.dto.UserDTO;

public interface UserService {
    UserDTO getUser();

    void createUser(UserDTO userDTO);

}
