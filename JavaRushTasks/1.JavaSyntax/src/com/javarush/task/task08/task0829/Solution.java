package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //List<String> addresses = new ArrayList<String>();
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String sity = reader.readLine();
            if (sity.isEmpty()) break;

            String family = reader.readLine();

            //addresses.add(family);
            addresses.put(sity, family);
        }

        //read home number
        String findCity = reader.readLine();

        /*if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/

        for (Map.Entry<String, String> a: addresses.entrySet()) {
            if (findCity.equals(a.getKey())) {
                System.out.println(a.getValue());
                break;
            }
        }
    }
}
