package com.iot83.app.controller;

import com.iot83.app.entitties.User;
import com.iot83.app.exceptions.MessageHandler;
import com.iot83.app.service.UserDetailsServiceImpl;
import com.iot83.app.service.UserService;
import com.iot83.app.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

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
    @PostMapping("/userDetails/save")
    public String addUser(@RequestBody User userDetails) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userDetails.getEmail(),
                    userDetails.getPassword()
            ));
        }
        catch (BadCredentialsException e) {
            throw new Exception("Incorrect Username  or Password",e);
        }

        final UserDetails userDetails1 = userDetailsService
                .loadUserByUsername(userDetails.getEmail());

        final String jwt = jwtTokenUtil.generateToken(userDetails1);

        userService.addUser(userDetails);

        return jwt;
    }

    //update old User
    @PutMapping("/userDetails")
    public User updateUser(@RequestBody User userDetails) {
        return  userService.updateUser(userDetails);
    }

    //delete User by Id
    @DeleteMapping("/userDetails/{userId}")
    public MessageHandler deleteUser(@PathVariable String userId) {
            userService.deleteUser(userId);
        return new MessageHandler("true" , "Record successfully deleted");
    }


}
