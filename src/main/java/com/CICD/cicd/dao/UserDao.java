package com.CICD.cicd.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.CICD.cicd.entities.User;



public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
