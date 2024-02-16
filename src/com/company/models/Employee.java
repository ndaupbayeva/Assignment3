package com.company.models;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String position;
    private int age;
    private boolean gender;

    public Employee(){}

    public Employee(String name, String surname, String position, int age, boolean gender) {
        setName(name);
        setSurname(surname);
        setPosition(position);
        setAge(age);
        setGender(gender);
    }

    public Employee(int id, String name, String surname, String position, int age, boolean gender) {
        this(name, surname, position, age, gender);
        setId(id);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + (gender ? "Male" : "Female") +
                '}';
    }
}
