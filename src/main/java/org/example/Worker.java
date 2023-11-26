package org.example;

public class Worker extends Employee{
    private float monthlyRate;

    public Worker(int id, String name, String position, float monthlyRate) {
        super(id, name, position);
        this.monthlyRate = monthlyRate;
    }

    @Override
    public float avgSalary() {
        return this.monthlyRate;
    }

    public float getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(float monthlyRate) {
        this.monthlyRate = monthlyRate;
    }
}
