package org.example;

import java.util.ArrayList;

public abstract class Employee {
    protected int id;
    protected String name;
    protected String position;

    protected Employee(int id, String name, String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }

    protected abstract float avgSalary();

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
