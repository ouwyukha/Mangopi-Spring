package com.ouwyukha.mangopi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ouwyukha.mangopi.model.User;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    @Query("{ $or: [{'firstName': {$regex: /?0/, $options: 'i' }}, {'lastName': {$regex: /?0/, $options: 'i'}}]}")
    public List<User> findByName(String name);
    
}