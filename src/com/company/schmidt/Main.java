package com.company.schmidt;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of cities you wish to provide the temps for");
        int length = sc.nextInt();

        // create a String array to save user input
        String[] input = new String[length];

        // loop over array to save user input
        System.out.println("Please enter the cities names");
        for (int i = 0; i < length; i++) {
            String userInput = sc.next();
            input[i] = userInput;
        }

        System.out.println("you entered the following cities : ");
        System.out.println(Arrays.toString(input));

        System.out.println("Please enter the average daily high tempature of each of the cities you have entered above: ");
        int temp = sc.nextInt();

        // create a String array to save user input
        int[] temps = new int[temp];

        for (int i = 0; i < length-1; i++) {
            int citiesTemps = sc.nextInt();
            temps[i] = citiesTemps;
        }
        int sum = IntStream.of(temps).sum();
        int averageTemps = sum / length;
        System.out.println("The average tempatures for all the cities you entered is: " + averageTemps);




    }
}
