package org.example.Head01_JavaProgrammingStart.example13;

import java.util.Arrays;

public class ArrayToSort {
    public static void main(String[] args) {
        int[] data = {5, 2, 8};
        Arrays.sort(data);

        System.out.println(Arrays.toString(data)); // [2, 5, 8]
    }
}