package org.example;

import java.util.Comparator;

public class Data {
    public void fill(){
        Employee.empList.add(new Worker(20200717, "Andrey", "Director", 160000));
        Employee.empList.add(new Freelancer(20211107, "Dmitry", "Driver", 400));
        Employee.empList.add(new Worker(202111071, "Mark", "Programmer", 120000));
        Employee.empList.add(new Worker(202111072, "Alexey", "Programmer", 90000));
        Employee.empList.add(new Worker(20211109, "Sergey", "Economist", 80000));
        Employee.empList.add(new Worker(20220717, "Irina", "HR", 70000));
        Employee.empList.add(new Freelancer(20230214, "Julia", "Premises cleaner", 200));
    }

    public void sort(){
        Comparator<Employee> cmp = new Comparator<>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
        Employee.empList.sort(cmp);
    }

    public void print(){
        for (Employee item: Employee.empList) {
            System.out.println(item.getName() + ": " + item.avgSalary());
        }
    }

}
