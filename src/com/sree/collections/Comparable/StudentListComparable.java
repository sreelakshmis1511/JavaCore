package com.sree.collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListComparable {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Ammu", 45));
        students.add(new Student(14, "Kichu", 12));
        students.add(new Student(23, "Abi", 35));

        Collections.sort(students);

        System.out.println(students);

    }
}
