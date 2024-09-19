package edu.guilford;
//Miles Carter 9/19/2024

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("You will be rolling 10 dice. How many sides should each have?");
        int sides = scan.nextInt();
        System.out.println("How many dice do you want to roll");

        int Number = 0;

        System.out.print("Number of dice");

        int sum = 0;

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < Number; i++) {
            int diceRoll = rand.nextInt(sides) + 1;
            sum += diceRoll;
            //System.out.println("sum of" + i + "d" + sides + "=" + sum);
        }
        System.out.println(Number + "d" + sides + "=" + sum);
        scan.close();
    }
}