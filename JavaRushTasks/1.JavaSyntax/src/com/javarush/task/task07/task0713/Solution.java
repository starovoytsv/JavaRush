package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list9 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int a: list) {
            if (a % 3 == 0) list3.add(a);
            if (a % 2 == 0) list2.add(a);
            if (a % 3 != 0 && a % 2 != 0) list9.add(a);
        }
        printList(list3);
        printList(list2);
        printList(list9);

    }

    public static void printList(List<Integer> list) {
        for (int a: list) {
            System.out.println(a);
        }
    }
}
