package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arN = new int[10];

        String[] arS = new String[10];

        for (int i = 0; i < arS.length; i++) {
            arS[i] = reader.readLine();
            arN[i] = arS[i].length();
        }

        for (int a: arN) {
            System.out.println(a);
        }


    }
}
