package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fr = new FileWriter(new File(reader.readLine()));

        BufferedWriter writer = new BufferedWriter(fr);

        while (true){
            String tmp = reader.readLine();
            writer.write(tmp);

            if (tmp.equals("exit")) break; else writer.newLine();
        }

        writer.close();
        reader.close();
        fr.close();
    }
}
