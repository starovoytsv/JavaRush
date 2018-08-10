package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(reader.readLine());

        if (number == 0 ) System.out.println("ноль");
        else{
            if (number > 0) System.out.print("положительное");
            else System.out.print("отрицательное");

            if (number % 2 == 0) System.out.print(" четное");
            else System.out.print(" нечетное");

            System.out.println(" число");
        }
    }
}
