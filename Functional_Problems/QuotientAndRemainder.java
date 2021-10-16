package com.company;

import java.util.Scanner;

public class QuotientAndRemainder {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of dividend : ");
        double dividend = sc.nextDouble();
        System.out.println("Enter the value of divisor : ");
        double divisor = sc.nextDouble();

        double quotient = dividend / divisor;
        double remainder = dividend % divisor;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}
