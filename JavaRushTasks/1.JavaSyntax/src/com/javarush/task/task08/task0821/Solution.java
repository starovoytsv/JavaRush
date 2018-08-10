package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "fam");
        map.put("name1", "fam");
        map.put("name2", "fam2");
        map.put("name3", "fam3");
        map.put("name4", "fam4");
        map.put("name5", "fam5");
        map.put("name6", "fam6");
        map.put("name7", "fam7");
        map.put("name8", "fam8");
        map.put("name", "fam9");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
