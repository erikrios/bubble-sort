package com.erikriosetiawan;

public class BubbleSort {

    // Method to sort the random values in array
    public void sort(int[] values, int arrayLength) {
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1; j++) {
                if (values[j] > values[j + 1]) {
                    swap(values[j], values[j + 1]);
                }
            }
        }
    }

    // Method to swap two value
    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
