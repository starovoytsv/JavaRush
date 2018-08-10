package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        int max = a;
        int min = a;
        int mid = a;

        if (max(a, b) > c) max = max(a, b);
        else max = c;

        if (min(a, b) < c) min = min(a, b);
        else min = c;

        mid = a + b + c - min - max;

        System.out.println(max + " " + mid + " " + min);
    }

    public static int max(int a, int b){
        int max = (a > b) ? a : b;

        return max;
    }

    public static int min(int a, int b){
        int min = (a < b) ? a : b;

        return min;
    }
}
