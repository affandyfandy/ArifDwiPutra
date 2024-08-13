package com.lambdacode.Spring_crud.service;

import com.lambdacode.Spring_crud.dto.UserDTO;
import com.lambdacode.Spring_crud.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);

    void updateName(Integer id, UserDTO userDTO);
}
