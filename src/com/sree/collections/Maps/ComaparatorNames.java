package com.sree.collections.Maps;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class ComaparatorNames implements Comparator<Map.Entry<Integer, String>> {

    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        String values1 = o1.getValue();
        String values2 = o2.getValue();

        return values1.compareTo(values2);
    }
}
