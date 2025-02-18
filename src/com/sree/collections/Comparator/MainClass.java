package com.sree.collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {


        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(3, "Appu", 500));
        emp.add(new Employee(2,"vinja", 890));

        Collections.sort(emp, new EmployeeComparator());

        System.out.println(emp);
    }
}
