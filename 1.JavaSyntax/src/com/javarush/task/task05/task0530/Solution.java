package com.javarush.task.task05.task0530;

/* 
Шеф, что-то не пашет
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
