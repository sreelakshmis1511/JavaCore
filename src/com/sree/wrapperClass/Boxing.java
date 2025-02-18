package com.sree.wrapperClass;

public class Boxing {

    public static void main(String[] args) {

        int a =1;
        int b =5;
        String c ="3.4";
        String d = "10";

//Boxing
      Integer wrapperA =  Integer.valueOf(1);  // int to INTEGER
      Double  wrapperB =  Double.valueOf(5);  //int to Double

//Parsing
      float wrapperC = Float.parseFloat(c);     //String to Float
      int wrapperD = Integer.parseInt(d);       //String to Integer

        System.out.println(wrapperA);
        System.out.println(wrapperB);
        System.out.println(wrapperC);
        System.out.println(wrapperD);    }
}
