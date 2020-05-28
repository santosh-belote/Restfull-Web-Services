/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices.users;

import com.san.restfullwebservices.exception.UserNotFoundException;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Santosh Belote
 */
@RestController
public class UserResource {

    @Autowired
    private UserDAOService service;

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User findUser(@PathVariable int id) {
        User user = service.findUser(id);
        if(user == null){
            throw new UserNotFoundException("Id-"+id);
        }
        return user;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        User savedUser = service.addUser(user);
        //
        URI location = ServletUriComponentsBuilder
                        .fromCurrentRequest()   // get current URI request
                        .path("/{id}")          // append to current URL
                        .buildAndExpand(savedUser.getId())
                        .toUri();

        return ResponseEntity.created(location).build();
    }
}
