package com.sree.collections.Comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (Integer.compare(o2.salary, o1.salary));
    }
}
