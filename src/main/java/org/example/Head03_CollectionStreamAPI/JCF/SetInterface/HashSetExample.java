package org.example.Head03_CollectionStreamAPI.JCF.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        //요소추가
        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");
        System.out.println("After Set: " + countries);
        //요소 포함 여부 확인
        System.out.println("Contins 'japan' ? " + countries.contains("japan"));
        //요소 제거
        countries.add("China");
        System.out.println("After remove 'China': " + countries);

        //개수확인
        System.out.println("Set size: " + countries.size());

        //전체 제거
        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
