package com.sree.java8Features.Supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> s = () -> LocalDate.now().getDayOfMonth();
        System.out.println(s.get());
    }
}
