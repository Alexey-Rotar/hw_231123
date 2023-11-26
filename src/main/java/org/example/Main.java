package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        ArrayList<Employee> empList = d.fill();
        d.sort(empList);
        d.print(empList);
    }
}
