package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JAN 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("MMM d yyyy", Locale.US);
        Date givenDate = formater.parse(date);
        Date yearStart = new Date(givenDate.getYear(), 0, 0);
        long interval = givenDate.getTime() - yearStart.getTime();
        long s =  (24*60*60*1000);
        int dayCounter = (int) (interval/s);
        if ((dayCounter % 2) == 1){
            return true;
        }
        else return false;
    }
}
