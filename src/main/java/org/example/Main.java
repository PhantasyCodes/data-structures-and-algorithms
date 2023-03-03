package org.example;

import org.example.algorithms.SortAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 6, 9, 1, 3, 7, 4, 10};

        System.out.println(Arrays.toString(SortAlgorithms.quickSort(array, 0 , 9)));
    }

    public static int power(int value, int power) {
        if (power == 1) {
            return 2;
        }
        return value * power(value, power - 1);
    }
}