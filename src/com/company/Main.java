package com.company;

import com.company.controllers.AdminController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.AdminRepository;
import com.company.repositories.interfaces.IRepository;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IRepository repo = new AdminRepository(db);
        AdminController controller = new AdminController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}
