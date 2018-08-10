package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] words = s.split(" +"); // split переводит нашу строку s в массив слов words
// " " - означает, что слово заканчивается на пробел, " +" - пробелов может идти несколько подряд

        for (String ss: words) {
            if (ss.length() != 0){
                System.out.print(ss.substring(0, 1).toUpperCase() + ss.substring(1) + " ");
                // ss.substring(0, 1) - берем первую букву слова ss и .toUpperCase() - меняем ее на заглавную
// ss.substring(1) + " " - добавляем остальные буквы начиная со второй, добавляем пробел
// таким образом, мы "починили" нашу строку выкинув из нее все лишние пробелы.
            }
        }

    }
}
