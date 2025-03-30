package com.example.demo.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    public String getName() {
        return name;
    }
/*************  ✨ Codeium Command ⭐  *************/
/**
 * Sets the name of the shelter.
 *
 * @param name the new name of the shelter
 */

/******  1ba5cb15-0ce8-489e-9fd9-90766594aa1a  *******/
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    private String address;
    private String phoneNumber;
    private String email;
}

