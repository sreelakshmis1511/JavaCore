package com.sree.java8Features.MethodReference;

public class staticMethodRef {

    public static void main(String[] args) {
        Interface1 i = staticMethodRef::sum;
        i.sum(2,4);
    }

    public static int sum(int a, int b){  //Definitiion of Functional interface
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
}
