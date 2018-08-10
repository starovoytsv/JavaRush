package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ar = new int[20];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(reader.readLine());
        }

        return ar;
    }

    public static int max(int[] array) {
        Arrays.sort(array);

        return array[array.length - 1];
    }
}
