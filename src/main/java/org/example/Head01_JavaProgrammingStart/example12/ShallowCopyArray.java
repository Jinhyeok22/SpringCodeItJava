package org.example.Head01_JavaProgrammingStart.example12;

import java.util.Arrays;

public class ShallowCopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = original;
        copy[0] = 100;

        System.out.println(original == copy);
        System.out.println(original.equals(copy)); // 100

  //  int num1 = 10;
  //  int num2 = 10;
  //  String str1 = "문자열";
   // String str2 = "문자열";

  //  System.out.println(num1 == num2);
  //  System.out.println("str1 == str2" + str1 == str2);






    }
}