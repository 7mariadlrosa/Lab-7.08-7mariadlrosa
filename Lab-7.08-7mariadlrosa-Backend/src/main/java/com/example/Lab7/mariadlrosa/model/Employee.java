package com.example.Lab7.mariadlrosa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    private String officeNumber;
    private String position;
    private String manager;

    public Employee() {
    }

    public Employee(String name, String phoneNumber, String officeNumber, String position, String manager) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.officeNumber = officeNumber;
        this.position = position;
        this.manager = manager;
    }

    //SETTERS
public void setId(Long id) {
        this.id = id;
    }

public void setName(String name) {
        this.name = name;
    }

public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

public void setPosition(String position) {
        this.position = position;
    }

public void setManager(String manager) {
        this.manager = manager;
    }


    //GETTERS

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getManager() {
        return manager;
    }

}
