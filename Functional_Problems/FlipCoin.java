package com.company;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    int heads = 0; // heads count

    public static void main(String[] args) {

        FlipCoin flipCoin = new FlipCoin(); // class object
        flipCoin.start();
    }

    void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of flips:");
        int numberOfFlips = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numberOfFlips; i++) {
            Random randomValue = new Random();
            double random = randomValue.nextInt(2);
            if (random < 0.5) 	//	tails
                System.out.print("Tails\t");
             else {            //	it's heads, increases heads count
                System.out.print("Heads\t");
               heads++;
            }
        }

        //	print heads and tails percentages
        System.out.println();
        System.out.println("Heads Percentage: " + ((double) heads / numberOfFlips)*100);
        System.out.println("Tails Percentage: " + (((double) numberOfFlips - heads) / numberOfFlips)*100);

    }
}
