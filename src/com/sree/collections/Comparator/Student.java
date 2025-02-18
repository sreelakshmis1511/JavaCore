package com.sree.collections.Comparator;

import java.util.Comparator;

public class Student  {  //POJO Class

    int rollno;
    String name;
    int physicsMarks;


    public Student(int rollno, String name, int physicsMarks) {
        this.rollno = rollno;
        this.name = name;
        this.physicsMarks = physicsMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", physicsMarks=" + physicsMarks +
                '}';
    }



}
