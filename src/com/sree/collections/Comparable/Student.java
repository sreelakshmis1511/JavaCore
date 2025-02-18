package com.sree.collections.Comparable;

public class Student implements Comparable<Student> {  //POJO Class

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

    @Override
    public int compareTo(Student o) {
      //return  Integer.compare(this.physicsMarks, o.physicsMarks);
      return    this.name.compareTo(o.name);
    }
}
