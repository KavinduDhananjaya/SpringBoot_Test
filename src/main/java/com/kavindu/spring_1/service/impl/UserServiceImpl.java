package com.kavindu.spring_1.service.impl;

import com.kavindu.spring_1.entity.User;
import com.kavindu.spring_1.repository.UserRepository;
import com.kavindu.spring_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public User addUser(User user) {
        return userRepository.save(user);

    }


    @Override
    public User findUser(int id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }

    }


}
