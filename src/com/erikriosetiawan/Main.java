package com.erikriosetiawan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declare the variables
        int[] values;
        int arrayLength;
        Scanner userInput = new Scanner(System.in);

        // Ask the user input for total of number
        System.out.printf("%s : ", "Please enter the total of number");
        arrayLength = userInput.nextInt();

        // Assign the object of array
        values = new int[arrayLength];

        // Ask the user input for the numbers
        int index = 0;
        do {
            System.out.printf("%s %d : ", "Value", index + 1);
            values[index] = userInput.nextInt();
            index++;
        } while (index < arrayLength);

        // Print the values before sorting
        printValues("Before sorting", values, arrayLength);

        // Sorting the values using bubble sort and print it's
        BubbleSort.sort(values, arrayLength);
        printValues("After sorting", values, arrayLength);
    }

    private static void printValues(String message, int[] values, int arrayLength) {
        System.out.printf("\n%s : ", message);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
