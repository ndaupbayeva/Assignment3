package com.company.models;
import java.sql.Time;

public class Order {
    private int id;
    private String name;
    private boolean finished;
    private String date;
    private String time;
    private String shipping_method;

    public Order(int id, String name, boolean finished, String time, String shipping_method){}

    public Order(String name, boolean finished, String date, String time, String shipping_method) {
        setName(name);
        setFinished(finished);
        setDate(date);
        setTime(time);
        setShipping_method(shipping_method);
    }

    public Order(int id, String name, boolean finished, String date, String time, String shipping_method) {
        this(name, finished, date, time, shipping_method);
        setId(id);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getShipping_method() {
        return shipping_method;
    }

    public void setShipping_method(String shipping_method) {
        this.shipping_method = shipping_method;
    }
}

