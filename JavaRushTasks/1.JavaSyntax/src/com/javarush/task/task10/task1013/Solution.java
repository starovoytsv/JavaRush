package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human(1);
        Human h3 = new Human(2, "a");
        Human h4 = new Human(2,"f",3);
        Human h5 = new Human(2,"f",3,4);
        Human h6 = new Human(2,"f",3,4,5);
        Human h7 = new Human(2,"f",3,4,5,"d");
        Human h8 = new Human(2,2);
        Human h9 = new Human("e",1);
        Human h10 = new Human("t","y");
    }

    public static class Human {
        private int i1 = 0;
        private String i2 = "";
        private int i3 = 0;
        private int i4 = 0;
        private int i5 = 0;
        private String i6 = "";

        public Human() {
            this.i1 = 1;
        }

        public Human(int i1) {
            this.i1 = i1;
        }

        public Human(int i1, String i2) {
            this.i1 = i1;
            this.i2 = i2;
        }

        public Human(int i1, String i2, int i3) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
        }

        public Human(int i1, String i2, int i3, int i4) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
            this.i4 = i4;
        }

        public Human(int i1, String i2, int i3, int i4, int i5) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
            this.i4 = i4;
            this.i5 = i5;
        }

        public Human(int i1, String i2, int i3, int i4, int i5, String i6) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
            this.i4 = i4;
            this.i5 = i5;
            this.i6 = i6;
        }

        public Human(int i1, int i3) {
            this.i1 = i1;
            this.i3 = i3;
        }

        public Human(String i2, int i3) {
            this.i2 = i2;
            this.i3 = i3;
        }

        public Human(String i2, String i6) {
            this.i2 = i2;
            this.i6 = i6;
        }
    }
}
