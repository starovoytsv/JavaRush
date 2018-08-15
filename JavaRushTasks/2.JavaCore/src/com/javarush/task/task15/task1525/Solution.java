package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    //ЧТЕНИЕ ИЗ ФАЙЛА
    //КОДИРОВКА

    static {
        try {
            BufferedReader fin = new BufferedReader(new InputStreamReader( new FileInputStream(Statics.FILE_NAME), "CP866"));
            String line;
            while ((line = fin.readLine()) != null) lines.add(line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
