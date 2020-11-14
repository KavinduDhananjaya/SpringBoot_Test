package com.kavindu.spring_1.controller;

import com.kavindu.spring_1.entity.User;
import com.kavindu.spring_1.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUsers( );
    }

    @GetMapping("/find/{uid}")
    public User findBook(@PathVariable int uid) {
        return  userServiceImpl.findUser(uid);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return  userServiceImpl.addUser(user);
    }

}
