package org.example.Head03_CollectionStreamAPI.StreamAPI.example04;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("one", "two", "three");

        long count = items.stream()
                .peek(s -> System.out.println("[peek 1]" + s))
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("[peek 2]" + s))
                .count();

        System.out.println("count of filtered items : " + count);
    }
}
