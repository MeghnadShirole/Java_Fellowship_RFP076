package com.company;

/**
 *  Computes the square root of a nonnegative number c using
 *  http://en.wikipedia.org/wiki/Newton's_method
 *  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 *
 *  % java Sqrt 2
 *  1.414213562373095
 */
public class SquareRoot {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);

        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        // print out the estimate of the square root of c
        System.out.println(t);
    }
}
