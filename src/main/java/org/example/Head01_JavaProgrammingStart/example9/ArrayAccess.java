package org.example.Head01_JavaProgrammingStart.example9;

public class OutOfBounds {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        System.out.println(data[3]); // 오류: ArrayIndexOutOfBoundsException
    }
}