package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код

        map.put("Stallone1", df.parse("OCTOBER 5 1980"));
        map.put("Stallone2", df.parse("AUGUST 30 1990"));
        map.put("Stallone3", df.parse("OCTOBER 1 1980"));
        map.put("Stallone4", df.parse("OCTOBER 1 1980"));
        map.put("Stallone5", df.parse("OCTOBER 1 1980"));
        map.put("Stallone6", df.parse("OCTOBER 1 1980"));
        map.put("Stallone7", df.parse("AUGUST 1 1980"));
        map.put("Stallone8", df.parse("AUGUST 1 1980"));
        map.put("Stallone9", df.parse("JUNE 20 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();

        while (it.hasNext()){
            Date date = it.next().getValue();
            if (date.getMonth() > 4 && date.getMonth() < 8) it.remove();
        }

    }

    public static void main(String[] args) throws ParseException {
        /*HashMap<String, Date> map = createMap();
        for (Map.Entry<String, Date> a: map.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }

        removeAllSummerPeople(map);

        System.out.println("111111111111111111111111");

        for (Map.Entry<String, Date> a: map.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }*/
    }
}
