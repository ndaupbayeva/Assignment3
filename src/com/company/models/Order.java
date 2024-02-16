package com.company.models;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    private int id;
    private String name;
    private boolean finished;
    private Date date;
    private LocalDateTime time;
    private String shipping_method;

    public Order(){}

    public Order(String name, boolean finished, Date date, LocalDateTime time, String shipping_method) {
        setName(name);
        setFinished(finished);
        setDate(date);
        setTime(time);
        setShipping_method(shipping_method);
    }

    public Order(int id, String name, boolean finished, Date date, LocalDateTime time, String shipping_method) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getShipping_method() {
        return shipping_method;
    }

    public void setShipping_method(String shipping_method) {
        this.shipping_method = shipping_method;
    }
}

