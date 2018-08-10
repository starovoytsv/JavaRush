package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;

        for (int i = 1; true; i++) {
            int number = Integer.valueOf(reader.readLine());
            if (number != -1) summ += number;
            else {
                i--;
                System.out.println((float) summ / i);
                break;
            }
        }
    }
}

