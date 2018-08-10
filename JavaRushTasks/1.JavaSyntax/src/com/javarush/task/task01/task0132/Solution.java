package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        char[] ArrChar = String.valueOf(number).toCharArray();
        int summ = 0;

        for (int i = 0; i < ArrChar.length; i++) {
            summ += ArrChar[i] - '0';
        }

        return summ;
    }
}