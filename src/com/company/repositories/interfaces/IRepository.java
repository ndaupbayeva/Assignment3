package com.company.repositories.interfaces;

import com.company.models.Employee;

import java.util.List;

public interface IRepository {
    boolean addEmployee(Employee employee);
    boolean deleteEmployee(int id);
    List<Employee> getAllEmployees();
}
