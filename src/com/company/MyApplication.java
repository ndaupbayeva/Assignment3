package com.company;

import com.company.controllers.AdminController;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final AdminController controller;
    private final Scanner scanner;

    public MyApplication(AdminController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to Restaurant Management System");
            System.out.println("Select option:");
            System.out.println("1. Edit Staff");
            System.out.println("2. Dishes");
            System.out.println("3. Orders");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-3): ");
                int option1 = scanner.nextInt();
                if (option1 == 1) {
                    System.out.println("Select option:");
                    System.out.println("1. Add Employee");
                    System.out.println("2. Delete Employee");
                    System.out.println("3. Get all Employees");
                    try {
                        System.out.print("Enter option (1-3): ");
                        int option2 = scanner.nextInt();
                        if (option2 == 1){
                            addEmployeeMenu();
                        }
                        if (option2 == 2){
                            deleteEmployeeMenu();
                        }
                        if (option2== 3){
                            getAllEmployeesMenu();
                        }
                    }catch(InputMismatchException e) {
                        System.out.println("Input must be integer: " + e);
                        scanner.nextLine();
                    }
                } else if (option1 == 2) {
                    System.out.println("Select option:");
                    System.out.println("1. Add Dish");
                    System.out.println("2. Delete Dish");
                    System.out.println("3. Get all Dishes");
                    System.out.println("4. Update Dish's cost");

                    try {
                        System.out.print("Enter option (1-3): ");
                        int option2 = scanner.nextInt();
                        if (option2 == 1) {
                            addDishMenu();
                        }
                        if (option2 == 2) {
                            deleteDishMenu();
                        }
                        if (option2 == 3) {
                            getAllDishesMenu();
                        }
                        if (option2 == 4) {
                            //Function For Updating Dishes
                            System.out.println("Dish updated");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input must be integer: " + e);
                        scanner.nextLine();
                    }
                }else if (option1 == 3) {
                    System.out.println("Select option:");
                    System.out.println("1. Add Order");
                    System.out.println("2. Delete Order");
                    System.out.println("3. Get all Orders");

                    try {
                        System.out.print("Enter option (1-3): ");
                        int option2 = scanner.nextInt();
                        if (option2 == 1){
                            addOrderMenu();
                        }
                        if (option2 == 2){
                            deleteOrderMenu();
                        }
                        if (option2== 3){
                            getAllOrdersMenu();
                        }
                    }catch(InputMismatchException e) {
                        System.out.println("Input must be integer: " + e);
                        scanner.nextLine();
                    }
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer: " + e);
                scanner.nextLine(); // to ignore incorrect input
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("*************************");
        }
    }

    public void addEmployeeMenu(){
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter position");
        String position = scanner.next();
        System.out.println("Please enter age");
        int age = scanner.nextInt();
        System.out.println("Please enter gender (male/female)");
        String gender = scanner.next();

        String response = controller.addEmployee(name, surname, position, age, gender);
        System.out.println(response);
    }

    public void deleteEmployeeMenu(){
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.deleteEmployee(id);
        System.out.println(response);
    }

    public void getAllEmployeesMenu(){
        String response = controller.getAllEmployees();
        System.out.println(response);
    }

    public void addDishMenu(){
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter difficulty");
        int difficulty = scanner.nextInt();
        System.out.println("Please enter cost");
        int cost = scanner.nextInt();

        String response = controller.addDish(name, difficulty, cost);
        System.out.println(response);
    }

    public void deleteDishMenu(){
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.deleteDish(id);
        System.out.println(response);
    }

    public void getAllDishesMenu(){
        String response = controller.getAllDishes();
        System.out.println(response);
    }

    public void addOrderMenu(){
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter order status");
        Boolean finished = scanner.nextBoolean();
        System.out.println("Please enter date");
        String date = scanner.next();
        System.out.println("Please enter time");
        String time = scanner.next();
        System.out.println("Please enter shipping_method");
        String shipping_method = scanner.next();

        String response = controller.addOrder(name, finished, date, time, shipping_method);
        System.out.println(response);
    }
    public void deleteOrderMenu(){
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.deleteOrder(id);
        System.out.println(response);
    }
    public void getAllOrdersMenu(){
        String response = controller.getAllOrders();
        System.out.println(response);

    }
}
