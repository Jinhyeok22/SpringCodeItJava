package org.example.Head03_CollectionStreamAPI.StreamAPI.example07;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Grape", "Banana");

        Set<String> uniqueFruits = fruits.stream().collect(Collectors.toSet());

        System.out.println("unique fruits: " + uniqueFruits);
    }
}
