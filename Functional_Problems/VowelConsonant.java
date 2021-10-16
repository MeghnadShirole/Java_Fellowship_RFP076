package com.company;

import java.util.Locale;
import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char alphabet = read.next().toLowerCase(Locale.ROOT).charAt(0);
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' )
            System.out.println(alphabet + " is vowel");
        else
            System.out.println(alphabet + " is consonant");

    }
}
