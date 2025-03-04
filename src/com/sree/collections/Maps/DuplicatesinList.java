package com.sree.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesinList {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
                int value = numMap.getOrDefault(nums[i], 0) + 1;
                numMap.put(nums[i], value);
        }

        for (Map.Entry<Integer, Integer> map : numMap.entrySet()) {
            if (map.getValue() == 1) {
                return map.getKey();
            }

        }
        return 0;
    }
}

