package com.company.controllers;

import com.company.models.Dish;
import com.company.models.Employee;
import com.company.models.Order;
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

    public String addDish(String name, int difficulty, int cost) {
        Dish dish = new Dish(name, difficulty, cost);

        boolean created = repo.addDish(dish);

        return (created ? "Dish was added!" : "Dish adding was failed!");
    }

    public String deleteDish(int id){
        boolean deleted = repo.deleteDish(id);

        return (deleted ? "Dish deleted!" : "Dish was not found!");
    }

    public String getAllDishes(){
        List<Dish> dishes = repo.getAllDishes();

        StringBuilder response = new StringBuilder();
        for (Dish dish : dishes) {
            response.append(dish.toString()).append("\n");
        }

        return response.toString();
    }

    public String addOrder(String name, boolean finished, String date, String time, String shipping_method) {
        boolean created = repo.addOrder(order);

        return (created ? "Employee was added!" : "Employee adding was failed!");
    }

    public String deleteOrder(int id){
        boolean deleted = repo.deleteDish(id);

        return (deleted ? "Dish deleted!" : "Dish was not found!");
    }


    public String getAllOrders(){
        List<Order> orders = repo.getAllOrders();

        StringBuilder response = new StringBuilder();
        for (Order order : orders) {
            response.append(order.toString()).append("\n");
        }

        return response.toString();
    }
}
