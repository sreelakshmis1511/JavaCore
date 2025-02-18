package com.sree.collections.Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.physicsMarks, o2.physicsMarks); //acsending order
//        return Integer.compare(o2.physicsMarks, o1.physicsMarks); //decending order
    }
}
