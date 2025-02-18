package com.sree.wrapperClass;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {

        int n = 9;
        Integer wrapN = n;   //AutoBoxing
        System.out.println(wrapN);

        int unboxN = wrapN;    //AutoUnboxing
        System.out.println(unboxN);

        Integer nn = null;
        int nw = nn;                // calls nn.intValue()
//        System.out.println(nw);   //Nullpointer exception

    }
}
