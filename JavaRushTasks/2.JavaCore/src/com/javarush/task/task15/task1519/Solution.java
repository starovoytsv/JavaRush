package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String tmp = reader.readLine();

            if (tmp.equals("exit")) break;

            try {
                if (tmp.contains(".")) print(Double.valueOf(tmp));
                else if (Integer.valueOf(tmp) > 0 && Integer.valueOf(tmp) < 128 ) print(Short.valueOf(tmp));
                else if (Integer.valueOf(tmp) <= 0 || Integer.valueOf(tmp) >= 128 ) print(Integer.valueOf(tmp));
            } catch (NumberFormatException e) {
                print(tmp);
            }

        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
