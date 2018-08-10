package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        boolean isTriangle = false;

        if (a + b > c) if (a + c > b) if ( b + c > a) isTriangle = true;

        if (isTriangle) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}