package com.kavindu.spring_1.service;


import com.kavindu.spring_1.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    User addUser(User user);

    User findUser(int id);

}
