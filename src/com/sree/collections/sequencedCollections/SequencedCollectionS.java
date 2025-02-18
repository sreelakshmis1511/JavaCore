package com.sree.collections.sequencedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SequencedCollectionS {

    public static void main(String[] args) {


        List<Integer> obj = new ArrayList<>();
        obj.add(12);
        obj.add(34);
        obj.add(11);
        obj.add(90);

      //  Collections.sort(obj, Collections.reverseOrder());
     //   obj.sort(Comparator.naturalOrder());
        obj.sort(Comparator.reverseOrder());


        List<String> places = new ArrayList<>();
        places.add("USA");
        places.add("Dubai");
        places.add("Australia");


        System.out.println(obj.toString());
    }

}
