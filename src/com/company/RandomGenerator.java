package com.company;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Generate 10 random integers between 5 and 95");

        Random rnd = new Random();

        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = 5 + rnd.nextInt(95);
            System.out.println("Generated number: " + randomInt);
        }

        System.out.println("Done.");
    }
}
