package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(reader.readLine());

        if (number >= 1 && number <=999 ){

            if (number % 2 == 0) System.out.print("четное");
            else System.out.print("нечетное");

            if (number / 100 >= 1) System.out.print(" трехзначное");
            else if (number / 10 >= 1) System.out.print(" двузначное");
            else System.out.print(" однозначное");

            System.out.println(" число");
        }

    }
}
