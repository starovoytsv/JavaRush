package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    abstract class StringObject implements SimpleObject //допишите здесь ваш код
    {
        public SimpleObject getInstance(String s) {
            return null;
        }
    }
}