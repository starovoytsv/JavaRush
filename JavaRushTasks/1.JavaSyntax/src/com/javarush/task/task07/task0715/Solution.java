package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

//        int size = list.size();

        for (int i = 0; i < list.size(); i+=2) {
            list.add(i + 1, "именно");
        }

        for (String a:
             list) {
            System.out.println(a);
        }
    }
}
