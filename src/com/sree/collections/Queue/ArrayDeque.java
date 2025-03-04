package com.sree.collections.Queue;

import java.util.Deque;

public class ArrayDeque {
    //we can add or remove elements from both sides.
    //for instantiation, we need a class that implements the Deque interface, and that class is ArrayDeque.
    //ArrayDeque is faster than LinkedList and Stack.


    public static void main(String[] args) {

        Deque<Integer> dq = new java.util.ArrayDeque<>();
        dq.add(23);
        dq.add(45);
        dq.offer(67);
        dq.offerFirst(11);

        dq.poll(); //remove head of queue
        System.out.println( " head of queue is " + dq.peek()); //retrieve head of queue


        for(int dn : dq){
            System.out.println(dn);
        }
    }


}
