package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if ((anotherCat.age +(anotherCat.weight * anotherCat.strength)) <  (this.age +(this.weight * this.strength))) return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
