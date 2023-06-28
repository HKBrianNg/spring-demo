package com.learning.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
  
}
