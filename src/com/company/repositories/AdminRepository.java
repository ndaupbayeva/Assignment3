package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.models.Employee;
import com.company.repositories.interfaces.IRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

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

    @Override
    public boolean deleteEmployee(int id){
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "DELETE from employees where ID = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            int rowsAffected = st.executeUpdate();

            return rowsAffected > 0;
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

    @Override
    public List<Employee> getAllEmployees() {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "SELECT id,name,surname,position,age,gender FROM employees";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Employee> employess = new LinkedList<>();
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("position"),
                        rs.getInt("age"),
                        rs.getBoolean("gender"));

                employess.add(employee);
            }

            return employess;
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

        return null;
    }
}