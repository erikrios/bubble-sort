package com.erikriosetiawan;

/**
 * Class to sorting some numbers using bubble sort algorithm
 */
public class BubbleSort {

    /**
     * Method to sort the random values in array
     */
    public static void sort(int[] values, int arrayLength) {
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
}
