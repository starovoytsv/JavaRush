package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int max = 1, maxTmp = 1, pred = list.get(0);

        for (int i = 1; i < 10; i++) {
            if (pred == list.get(i))
                maxTmp++;
            else{
                if (maxTmp > max) max = maxTmp;
                maxTmp = 1;
            }
            pred = list.get(i);
        }

        if (maxTmp > max) max = maxTmp;

        System.out.println(max);

    }
}