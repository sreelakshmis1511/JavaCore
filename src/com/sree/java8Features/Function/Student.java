package com.sree.java8Features.Function;

public class Student {

    String name;
    int age;
    int PhysiscsMarks;

    public String getName() {
        return name;
    }

    public Student(String name, int age, int physiscsMarks) {
        this.name = name;
        this.age = age;
        PhysiscsMarks = physiscsMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhysiscsMarks() {
        return PhysiscsMarks;
    }

    public void setPhysiscsMarks(int physiscsMarks) {
        PhysiscsMarks = physiscsMarks;
    }
}
