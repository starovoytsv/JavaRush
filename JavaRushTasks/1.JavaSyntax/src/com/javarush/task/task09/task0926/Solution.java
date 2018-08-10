package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();

        int[] ar1 = {2, 5, 7, 8, 3};
        int[] ar2 = {2, 5};
        int[] ar3 = {2, 5, 7, 8};
        int[] ar4 = {2, 5, 7, 8, 3, 0, 1};
        int[] ar5 = {};
        arrayList.add(ar1);
        arrayList.add(ar2);
        arrayList.add(ar3);
        arrayList.add(ar4);
        arrayList.add(ar5);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
