package com.company.models;

public class Dish {
    private int id;
    private String name;
    private int difficulty;
    private int cost;

    public Dish(){}

    public Dish(String name, int difficulty, int cost) {
        setName(name);
        setDifficulty(difficulty);
        setCost(cost);
    }

    public Dish(int id, String name, int difficulty, int cost) {
        this(name, difficulty, cost);
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

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
