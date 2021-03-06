package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inStream = new FileInputStream(reader.readLine());
        while (inStream.available() > 0)
        {
            System.out.print((char) inStream.read()); //читаем один байт из потока для чтения D:\scr.sql
        }

        inStream.close(); //закрываем потоки
        reader.close();
    }
}