package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try {
            String tmp =  new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (tmp.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
            else if (tmp.equals(Planet.MOON)) thePlanet = Moon.getInstance();
            else if (tmp.equals(Planet.SUN)) thePlanet = Sun.getInstance();
            else thePlanet = null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
