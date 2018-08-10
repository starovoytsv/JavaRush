package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wage = Integer.parseInt(reader.readLine().toString());

        System.out.println("Я буду зарабатывать $" + wage +" в час");
    }
}
