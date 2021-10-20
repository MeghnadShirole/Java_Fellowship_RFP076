package com.company;

import java.util.Scanner;

public class CheckEqualityOfLinesOOP {


    static double X1;
    static double Y1;
    static double X2;
    static double Y2;
    static double XX1;
    static double YY1;
    static double XX2;
    static double YY2;


    public static void main(String[] args) {

        Double LengthOfLine_1=LengthOfLine1();
        Double LengthOfLine_2=LengthOfLine2();

        System.out.println("Equality of two lines : " + LengthOfLine_1.equals(LengthOfLine_2 ));

    }

    static double LengthOfLine1() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of starting point of first line at X axis: ");
        X1=sc.nextDouble();

        System.out.print("Enter the value of starting point of first line at Y axis: ");
        Y1 = sc.nextDouble();

        System.out.print("Enter the value of end point of first line at X axis: ");
        X2 = sc.nextDouble();

        System.out.print("Enter the value of end point of first line at Y axis: ");
        Y2 = sc.nextDouble();

        return Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));

    }

    static double LengthOfLine2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of starting point of second line at X axis: ");
        XX1 = sc.nextDouble();

        System.out.print("Enter the value of starting point of second line at Y axis: ");
        YY1 = sc.nextDouble();

        System.out.print("Enter the value of end point of second line at X axis: ");
        XX2 = sc.nextDouble();

        System.out.print("Enter the value of end point of second line at Y axis: ");
        YY2 = sc.nextDouble();

        return Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));

    }
}