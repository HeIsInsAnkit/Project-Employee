package com.iot83.app.controller;

import com.iot83.app.Entitty.User;
import com.iot83.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String HomePage() {
        return "Welcome in Home page";
    }

    //Get User Details
    @GetMapping("/userDetails")
    public List<User> getUsers() {
        return userService.getUserDetails();
    }


    //Get Single User Data
    @GetMapping("/userDetails/{userId}")
    public User getSingleUser(@PathVariable String userId) {
        return userService.getSingleUser(userId);
    }

    //Add new User
    @PostMapping("/userDetails")
    public User addUser(@RequestBody User userDetails) {
        return userService.addUser(userDetails);
    }

    //update old User
    @PutMapping("/userDetails")
    public User updateUser(@RequestBody User userDetails) {
        return  userService.updateUser(userDetails);
    }

    //delete User by Id
    @DeleteMapping("/userDetails/{userId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId) {
        try {
            userService.deleteUser(userId);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
