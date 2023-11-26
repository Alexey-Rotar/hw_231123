package org.example;

import java.util.ArrayList;

public abstract class Employee {
    protected int number;
    protected String name;
    protected String position;

    protected Employee(int number, String name, String position){
        this.number = number;
        this.name = name;
        this.position = position;
    }
    public static ArrayList<Employee> empList = new ArrayList<>();

    protected abstract float avgSalary();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
