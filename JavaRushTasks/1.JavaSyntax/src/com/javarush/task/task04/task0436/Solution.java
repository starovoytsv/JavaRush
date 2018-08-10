package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.valueOf(reader.readLine());
        int n = Integer.valueOf(reader.readLine());

        int n1 = n;

        for (;m > 0; m--){
            n = n1;
            for (; n > 0 ; n--) System.out.print(8);
            System.out.println("");
        }

    }
}
