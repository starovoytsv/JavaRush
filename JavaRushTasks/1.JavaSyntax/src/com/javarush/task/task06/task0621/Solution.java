package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grossFatherName = reader.readLine();
        Cat catGrossFather = new Cat(grossFatherName);

        String grossMotherName = reader.readLine();
        Cat catGrossMother = new Cat(grossMotherName);

        String fatherName = reader.readLine();
        Cat CatFather = new Cat(fatherName, null, catGrossFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrossMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, CatFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, CatFather);

        System.out.println(catGrossFather);
        System.out.println(catGrossMother);
        System.out.println(CatFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String text = "Cat name is " + name;
            if (mother == null) text += ", no mother"; else text += ", mother is " + mother.name;
            if (father == null) text += ", no father"; else text += ", father is " + father.name;

            return text;
        }
    }

}
