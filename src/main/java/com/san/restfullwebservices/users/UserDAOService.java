/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Santosh Belote
 */
@Component
public class UserDAOService {

    private static int userCount = 3;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Santosh", new Date()));
        users.add(new User(2, "Sunita", new Date()));
        users.add(new User(3, "Mrunalini", new Date()));
    }

    public User addUser(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User findUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }

        }
        return null;
    }

}
