package com.company.controllers;

import com.company.models.Employee;
import com.company.repositories.interfaces.IRepository;

import java.util.List;

public class AdminController  {

    private final IRepository repo;

    public AdminController(IRepository repo) {
        this.repo = repo;
    }

    public String addEmployee(String name, String surname, String position, int age, String gender) {
        boolean male = gender.toLowerCase().equals("male");
        Employee employee = new Employee(name, surname, position, age, male);

        boolean created = repo.addEmployee(employee);

        return (created ? "Employee was added!" : "Employee adding was failed!");
    }

    public String deleteEmployee(int id){
        boolean deleted = repo.deleteEmployee(id);

        return (deleted ? "User deleted!" : "User was not found!");
    }

    public String getAllEmployees(){
        List<Employee> employees = repo.getAllEmployees();

        StringBuilder response = new StringBuilder();
        for (Employee employee : employees) {
            response.append(employee.toString()).append("\n");
        }

        return response.toString();
    }
}
