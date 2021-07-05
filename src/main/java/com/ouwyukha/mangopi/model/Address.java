package com.ouwyukha.mangopi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Address {
    private String city;
    private String street;
    
    public Address(
        final String city,
        final String street) {
            this.city = city;
            this.street = street;
        }
}