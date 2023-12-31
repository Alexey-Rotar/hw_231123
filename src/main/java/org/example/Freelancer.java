package org.example;

public class Freelancer extends Employee{
    private float hourlyRate;

    public Freelancer(int id, String name, String position, float hourlyRate) {
        super(id, name, position);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float avgSalary() {
        return 20.8F*8*this.hourlyRate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
