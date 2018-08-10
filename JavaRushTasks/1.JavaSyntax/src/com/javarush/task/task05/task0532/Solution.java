package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());

        int [] array = new int[n];

        //ввод массива
        for (int i = 0; i < n; i++) {
            array[i] = Integer.valueOf(reader.readLine());
        }

        int maximum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (maximum < array[i]) maximum = array[i];
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
