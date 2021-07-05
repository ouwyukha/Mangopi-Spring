package com.ouwyukha.mangopi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ouwyukha.mangopi.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}