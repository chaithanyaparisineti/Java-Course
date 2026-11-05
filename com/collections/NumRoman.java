package com.collections;
import java.util.Scanner;
import java.util.LinkedHashMap;
//Numbers to RomanNumbers
public class NumRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer:");
        int num = sc.nextInt();
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = {"M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV", "I" };
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
             roman.append(symbols[i]);
                num = num - values[i];
            }
        }
        System.out.println("Roman Number: " + roman);
        sc.close();    
}
}

