package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());
        int d = Integer.valueOf(reader.readLine());

        int max = a;

        if (max(a, b) > max(c, d)) System.out.println(max(a, b));
        else System.out.println(max(c, d));
    }

    public static int max(int a, int b){
        int max = (a > b) ? a : b;

        return max;
    }
}
