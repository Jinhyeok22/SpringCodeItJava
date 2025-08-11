package org.example.Head01_JavaProgrammingStart.example09;

<<<<<<< HEAD
public class ArrayAccess {
    public static void main(String[] args) {
        int[] scores = {88, 92, 76};
        System.out.println(scores[0]); // 88
        scores[1] = 95;
        System.out.println(scores[1]); // 95
=======
public class OutOfBounds {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        System.out.println(data[3]); // 오류: ArrayIndexOutOfBoundsException
>>>>>>> 98ca9e1 (Test)
    }
}