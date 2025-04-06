package com.reyes.estetica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reyes.estetica.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    

}
