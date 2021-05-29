package com.example.demoMongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("employee")
public class Employee {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private double Salary;
    private double experience;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return Salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
