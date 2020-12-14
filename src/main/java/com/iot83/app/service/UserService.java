package com.iot83.app.service;

import com.iot83.app.entitties.User;

import java.util.List;

public interface UserService {

    List<User> getUserDetails();

    User getSingleUser(String userId);

    User addUser(User userDetails);

    User updateUser(User userDetails);

    void deleteUser(String userId);

}
