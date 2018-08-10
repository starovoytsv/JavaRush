package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;

        while (true){
            String tempReader = reader.readLine();
            if (tempReader.equals("сумма")){
                System.out.println(summ);
                break;
            }
            else summ += Integer.valueOf(tempReader);
        }
    }
}
