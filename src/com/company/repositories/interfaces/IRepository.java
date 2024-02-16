package com.company.repositories.interfaces;

import com.company.models.Dish;
import com.company.models.Employee;
import com.company.models.Order;

import java.util.List;

public interface IRepository {
    boolean addEmployee(Employee employee);
    boolean addDish(Dish dish);
    boolean addOrders(Order order);
    boolean deleteEmployee(int id);
    boolean deleteDish(int id);
    List<Employee> getAllEmployees();
    List<Dish> getAllDishes();

    List<Order> getAllOrders();
}
