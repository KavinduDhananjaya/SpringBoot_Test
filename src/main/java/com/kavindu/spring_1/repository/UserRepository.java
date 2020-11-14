package com.kavindu.spring_1.repository;

import com.kavindu.spring_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
