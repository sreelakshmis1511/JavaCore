package com.sree.java8Features.MethodReference;

public class InstanceMethod {

    public static void main(String[] args) {

        InstanceMethod obj = new InstanceMethod();
        Interface1 i = obj::sum;
        i.sum(4,3);
    }

    public int sum(int a, int b){
        int sum = a+ b;
        System.out.println(sum);
        return sum;
    }
}
