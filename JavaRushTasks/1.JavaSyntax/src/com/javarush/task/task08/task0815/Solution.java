package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Fam1", "Name"); map.put("Fam2", "Name");
        map.put("Fam3", "Name"); map.put("Fam4", "Name");
        map.put("Fam5", "Name"); map.put("Fam6", "Name");
        map.put("Fam7", "Name"); map.put("Fam8", "Name");
        map.put("Fam9", "Name"); map.put("Fam10", "Name");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int t = 0;

        for (Map.Entry<String, String> a: map.entrySet()) {
            if (a.getValue().equals(name)) t++;
        }

        return t;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int t = 0;

        for (Map.Entry<String, String> a: map.entrySet()) {
            if (a.getKey().equals(lastName)) t++;
        }

        return t;

    }

    public static void main(String[] args) {

    }
}
