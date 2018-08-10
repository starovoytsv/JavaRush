package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> arrayCh4 = new ArrayList<>();

        Human child1 = new Human("child1", false, 1, arrayCh4);
        Human child2 = new Human("child2", true, 2, arrayCh4);
        Human child3 = new Human("child3", false, 3, arrayCh4);

        ArrayList<Human> arrayCh1 = new ArrayList<>();
        arrayCh1.add(child1);
        arrayCh1.add(child2);
        arrayCh1.add(child3);


        Human father = new Human("father", true, 30, arrayCh1);
        Human mother = new Human("mother", false, 31, arrayCh1);

        ArrayList<Human> arrayCh2 = new ArrayList<>();
        arrayCh2.add(father);

        ArrayList<Human> arrayCh3 = new ArrayList<>();
        arrayCh3.add(mother);


        Human grossfather1 = new Human("grossfather1", true, 60, arrayCh2);
        Human grossmother1 = new Human("grossmother1", false, 61, arrayCh2);
        Human grossfather2 = new Human("grossfather2", true, 65, arrayCh3);
        Human grossmother2 = new Human("grossmother2", false, 66, arrayCh3);

        System.out.println(grossfather1.toString());
        System.out.println(grossmother1.toString());
        System.out.println(grossfather2.toString());
        System.out.println(grossmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        /*public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }*/

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();

            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
