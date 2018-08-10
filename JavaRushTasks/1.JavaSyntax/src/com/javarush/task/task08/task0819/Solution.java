package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat a: cats) {
            System.out.println(a);
        }
    }

    // step 1 - пункт 1
    public static class Cat{
        public Cat() {
        }
    }
}
