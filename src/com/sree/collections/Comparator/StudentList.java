package com.sree.collections.Comparator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "pommu", 45));
        students.add(new Student(21, "Kichu", 45));
        students.add(new Student(23, "Abi", 45));

    //    Collections.sort(students, new StudentComparator());

        //TO SORT ON THE BASIS OF MULTIPLE FIELDS

        Comparator<Student> s1 = (n1,n2)  -> Integer.compare(n1.rollno, n2.rollno);
        Comparator<Student> s2 = (n3,n4)  -> Integer.compare(n3.physicsMarks, n4.physicsMarks);
        Comparator<Student> s3 = (n5,n6)  -> n5.name.compareTo(n6.name);

        Collections.sort(students, s1.thenComparing(s2).thenComparing(s3));

        System.out.println(students);

    }
}
