package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int out = 0; out <= array.length - 1; out++){  //Внешний цикл
            for (int in = 0; in <= array.length - 1; in++){       //Внутренний цикл
                if (isNumber(array[out]) && isNumber(array[in])) {
                    int n1 = Integer.parseInt(array[out]);
                    int n2 = Integer.parseInt(array[in]);
                    if (n1 > n2) {              //Если порядок элементов нарушен
                        //toSwap(in, in + 1);             //вызвать метод, меняющий местами
                        String tmp = array[out];
                        array[out]= array[in];
                        array[in] = tmp;
                    }
                }
                else if (!isNumber(array[out]) && !isNumber(array[in])) {
                    if (!isGreaterThan(array[out], array[in])) {              //Если порядок элементов нарушен
                        String tmp = array[out];
                        array[out] = array[in];
                        array[in] = tmp;
                    }
                }

            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
