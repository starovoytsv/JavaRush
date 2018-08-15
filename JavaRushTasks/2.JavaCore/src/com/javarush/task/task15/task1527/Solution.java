package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String url = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String string = url.substring(url.indexOf("?") + 1);

        String objVal = "";

        for (String s: string.split("&")) {
            if (s.indexOf("=") != -1) {
                if (s.indexOf("obj") != -1) objVal = s.substring(s.indexOf("=") + 1);

                s = s.substring(0, s.indexOf("="));
            }

            System.out.print(s + " ");
        }

        System.out.println();

        if (!objVal.isEmpty()){
            try {
                Double d = Double.valueOf(objVal);
                alert(d);
            } catch (NumberFormatException e) {
                alert(objVal);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
