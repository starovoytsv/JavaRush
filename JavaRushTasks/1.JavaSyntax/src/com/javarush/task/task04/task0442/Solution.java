package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, summ = 0;
        while (a != -1) {
            a = Integer.valueOf(reader.readLine());
            summ += a;
        }

        System.out.println(summ);

    }
}
