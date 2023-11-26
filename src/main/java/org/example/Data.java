package org.example;

public class Data {
    public void fill(){
        Employee.empList.add(new Worker(20200717, "Andrey Smirnov", "Director", 160000));
        Employee.empList.add(new Freelancer(20211107, "Dmitriy Shilov", "Driver", 410));
        Employee.empList.add(new Worker(202111071, "Mark Zinc", "Programmer", 120000));
        Employee.empList.add(new Worker(202111072, "Alexey Kolesnikov", "Programmer", 90000));
        Employee.empList.add(new Worker(20211109, "Sergey Filatov", "Economist", 80000));
        Employee.empList.add(new Worker(20220717, "Viktoria Gribkova ", "HR-manager", 70000));
        Employee.empList.add(new Freelancer(20230214, "Julia Dubova", "Premises cleaner", 200));
        Employee.empList.add(new Freelancer(20230918, "Walter White", "Сhemist", 3000));
    }

    public void sort(){
        EmployeeComparator cmp = new EmployeeComparator();
        Employee.empList.sort(cmp);
    }

    public void print(){
        for (Employee item: Employee.empList) {
            System.out.println(item.getName() + ": " + item.avgSalary());
        }
    }

}
