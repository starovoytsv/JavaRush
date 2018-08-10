package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Fam1", "Name1"); map.put("Fam2", "Name");
        map.put("Fam3", "Name"); map.put("Fam4", "Name");
        map.put("Fam5", "Name2"); map.put("Fam6", "Name45");
        map.put("Fam7", "Name"); map.put("Fam8", "Name3");
        map.put("Fam9", "Name"); map.put("Fam10", "Name3");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        /*Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()){
            String name = it.next().getValue();
            removeItemFromMapByValue(map, name);
        }*/

        /*HashMap<String, String> copy = (HashMap<String, String>) map;

        for (Map.Entry<String, String> a: copy.entrySet()) {
            removeItemFromMapByValue(map, a.getValue());
        }*/

        HashMap<String, String> copy = new HashMap<String, String>(map); // создаём копию массива
        for (Map.Entry<String, String> pair : copy.entrySet()){          // итератор ?
            int freqeuncy = Collections.frequency(copy.values(), pair.getValue());  // применяем метод Collections.frequency, находит повторения в виде числа > 1
            if (freqeuncy > 1){
                removeItemFromMapByValue(map, pair.getValue()); // если такие имеются то передаём в метод для удаления.
            }

        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        /*HashMap<String, String> map = createMap();
        for (Map.Entry<String, String> a: map.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }

        removeTheFirstNameDuplicates(map);

        System.out.println("111111111111111111111111");

        for (Map.Entry<String, String> a: map.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }*/
    }
}
