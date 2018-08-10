package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Fam1", 500); map.put("Fam2", 5);
        map.put("Fam3", 1000); map.put("Fam4", 300);
        map.put("Fam5", 1); map.put("Fam6", 563);
        map.put("Fam7", 2); map.put("Fam8", 1500);
        map.put("Fam9", 3); map.put("Fam10", 5);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}