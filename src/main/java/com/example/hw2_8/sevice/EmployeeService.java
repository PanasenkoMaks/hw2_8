package com.example.hw2_8.sevice;

import com.example.hw2_8.domain.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String name, String surname, int salary, int department);
    Employee find(String name, String surname);
    Employee remove (String name, String surname);

    Collection<Employee> findAll();
}
