package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.models.Employee;
import com.company.repositories.interfaces.IRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminRepository implements IRepository {

    private final IDB db;

    public AdminRepository(IDB db) {
        this.db = db;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "INSERT INTO employees(name,surname,position,age,gender) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, employee.getName());
            st.setString(2, employee.getSurname());
            st.setString(3, employee.getPosition());
            st.setInt(4, employee.getAge());
            st.setBoolean(5, employee.getGender());

            st.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("sql error: " + e.getMessage());
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                System.out.println("sql error: " + e.getMessage());
            }
        }


        return false;
    }
}