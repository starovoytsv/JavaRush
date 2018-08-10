package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //InputStream inputStream = new FileInputStream(bufferedReader.readLine());

        BufferedReader fileStream = new BufferedReader(new InputStreamReader(new FileInputStream(bufferedReader.readLine())));

        ArrayList<Integer> array = new ArrayList<>();

        while (fileStream.ready()) {
            int data = Integer.parseInt(fileStream.readLine());
            if (data % 2 == 0) array.add(data);
        }

        Collections.sort(array);

        for (Integer i: array) {
            System.out.println(i);
        }

        fileStream.close();
        bufferedReader.close();
    }
}
