package org.example;

import java.util.ArrayList;

public class Data {
    public ArrayList<Employee> fill(){
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Worker(20200717, "Andrey Smirnov", "Director", 160000));
        empList.add(new Freelancer(20211107, "Dmitriy Shilov", "Driver", 410));
        empList.add(new Worker(202111071, "Mark Zinc", "Programmer", 120000));
        empList.add(new Worker(202111072, "Alexey Kolesnikov", "Programmer", 90000));
        empList.add(new Worker(20211109, "Sergey Filatov", "Economist", 80000));
        empList.add(new Worker(20220717, "Viktoria Gribkova ", "HR-manager", 70000));
        empList.add(new Freelancer(20230214, "Julia Dubova", "Premises cleaner", 200));
        empList.add(new Freelancer(20230918, "Walter White", "Сhemist", 3000));
        empList.add(new Freelancer(20231123, "Jesse Pinkman", "Сhemist's helper", 500));
        return empList;
    }

    public void sort(ArrayList<Employee> empList){
        EmployeeComparator cmp = new EmployeeComparator();
        empList.sort(cmp);
    }

    public void print(ArrayList<Employee> empList){
        for (Employee item: empList) {
            System.out.println(item.getName() + ": " + item.avgSalary());
        }
    }

}
