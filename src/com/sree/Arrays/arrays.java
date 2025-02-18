package com.sree.Arrays;

import com.sree.model.Person;

public class arrays {

    public static void main(String[] args) {
        int[] st = new int[9];

        int[] mobileNums = new int[5];
        Person[] persons = new Person[3];
        String[] genders = new String[5];
        int[] rolls = {1,2,3};

        String[] names = {"Ammmu", "Appu", "Kukku"};
        for(String n : names){
            System.out.println(n.toUpperCase());
        }
    }
}
