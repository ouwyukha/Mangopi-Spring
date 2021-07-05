package com.ouwyukha.mangopi.model;

import java.util.List;
import java.sql.Timestamp;  

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String gender;
	private Address address;
    private List<String> followingList;
    private List<String> followerList;
    
    public User(
        final String firstName,
        final String lastName,
        final String email,
        final int age,
        final String gender,
        final Address address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.age = age;
            this.gender = gender;
            this.address = address;
        }
}