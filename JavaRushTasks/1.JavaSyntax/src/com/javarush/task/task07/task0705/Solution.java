package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ar = new int[20];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(reader.readLine());
        }

        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        for (int i = 0; i < ar.length; i++) {
            if (i < 10) ar1[i] = ar[i];
            else ar2[i - 10] = ar[i];
        }

        for (int a: ar2) {
            System.out.println(a);
        }
    }
}
