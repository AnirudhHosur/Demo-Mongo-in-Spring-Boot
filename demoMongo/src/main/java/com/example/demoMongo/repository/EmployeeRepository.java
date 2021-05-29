package com.example.demoMongo.repository;

import com.example.demoMongo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.naming.directory.Attribute;

@Repository
public interface EmployeeRepository extends org.springframework.data.mongodb.repository.MongoRepository<Employee,Integer> {
}
