package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grossfather1 = new Human("Дед1", true, 99);
        Human grossmother1 = new Human("Баба1", false, 98);
        Human grossfather2 = new Human("Дед2", true, 97);
        Human grossmother2 = new Human("Баба2", false, 96);
        Human father = new Human("Отец", true, 40, grossfather1, grossmother1);
        Human mother = new Human("Мать", false, 39, grossfather2, grossmother2);
        Human children1 = new Human("Ребёнок1", true, 5, father, mother);
        Human children2 = new Human("Ребёнок2", false, 11, father, mother);
        Human children3 = new Human("Ребёнок3", true, 13, father, mother);

        System.out.println(grossfather1);
        System.out.println(grossmother1);
        System.out.println(grossfather2);
        System.out.println(grossmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















