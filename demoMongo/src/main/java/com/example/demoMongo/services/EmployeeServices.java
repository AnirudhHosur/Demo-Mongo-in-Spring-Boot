package com.example.demoMongo.services;

import com.example.demoMongo.entity.Employee;

import java.util.List;

public interface EmployeeServices {
    public interface EmployeeService {
        Employee save(Employee employee);
        Employee findById(int id);
        void deleteById(int id);
        List<Employee> findAll();
    }

}
