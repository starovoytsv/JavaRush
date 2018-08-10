package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if(a <= 0) throw new Exception();
        if(b <= 0) throw new Exception();

        int min = a > b ? a : b;
        int max = a > b ? b : a;
        int delitel = 0;
        for (int i = 1; i < min; i++) {
            if (max % i == 0 && min % i == 0) {
                delitel = i;
            }
        }

        System.out.println(delitel);


    }
}
