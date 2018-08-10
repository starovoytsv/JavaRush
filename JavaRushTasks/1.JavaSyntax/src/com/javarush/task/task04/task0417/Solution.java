package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        boolean space = false;

        if (a == b || a == c){
            System.out.print(a);
            space = true;
        }
        if (b == a || b == c) {
            if (space) System.out.print(" ");
            else space = true;
            System.out.print(b);
        }
        if (c == a || c == b) {
            if (space) System.out.print(" ");
            System.out.print(c);
        }

    }
}