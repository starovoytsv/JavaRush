package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < min) min = list.get(i).length();
        }

        int max = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > max) max = list.get(i).length();
        }

        for (String a: list) {
            if (a.length() == min || a.length() == max){
                System.out.println(a);
                break;
            }
        }
    }
}
