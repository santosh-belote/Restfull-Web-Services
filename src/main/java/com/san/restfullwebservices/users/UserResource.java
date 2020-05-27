/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices.users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author krawler
 */
@RestController
public class UserResource {

    @Autowired
    private UserDAOService service ;

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User findUser(@PathVariable int id) {
        return service.findUser(id);
    }
}
