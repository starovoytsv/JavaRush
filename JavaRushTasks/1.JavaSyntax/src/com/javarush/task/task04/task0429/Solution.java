package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        int countPlus = 0;
        int countMinus = 0;

        if (a > 0) countPlus++;
        else if (a < 0) countMinus++;

        if (b > 0) countPlus++;
        else if (b < 0) countMinus++;

        if (c > 0) countPlus++;
        else if (c < 0) countMinus++;

        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);

    }
}
