package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ar = new int[15];
        int ch = 0;
        int nch = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0) ch += ar[i];
            else nch += ar[i];
        }

        if (ch > nch) System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (nch > ch) System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
