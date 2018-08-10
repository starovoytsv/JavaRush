package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Scanner file=new Scanner(new File("C:\\1\\text.txt"));
            while(!file.next().equals("equaller")){
                file.next();
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] p =  new int[-2];
            p[-3]=5;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new StringIndexOutOfBoundsException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new Exception();
        } catch (Exception e){
            exceptions.add(e);
        }

    }
}
