package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(5); set.add(15); set.add(25); set.add(35);
        set.add(6); set.add(16); set.add(26); set.add(36);
        set.add(7); set.add(17); set.add(27); set.add(37);
        set.add(8); set.add(18); set.add(28); set.add(38);
        set.add(9); set.add(19); set.add(29); set.add(39);

        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            if (it.next() > 10) it.remove();
        }

        return set;

    }

    public static void main(String[] args) {

    }
}
