package org.example;

import org.example.algorithms.SearchAlgorithms;
import org.example.algorithms.SortAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 4, 2, 6, 9, 7, 8, 10};

        int[] newArray = SortAlgorithms.selectionSort(array);

        System.out.println(Arrays.toString(newArray));
    }


}