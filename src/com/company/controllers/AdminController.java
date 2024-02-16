package com.company.controllers;

import com.company.models.Employee;
import com.company.repositories.interfaces.IRepository;

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
}
