package org.example.Head01_JavaProgrammingStart.example01;
// 변수 선언 및 출력
public class Test1 {
    public static void main(String[] args) {


        int score = 88;
        String result = (score >= 90) ? "a학점" : "B학점";
        System.out.println("성적: " + result);
    }
}

/*  연산자 활용
    public class VariableExample {
    public static void main(String[] args) {
        int age = 30;
        double temperature = 36.6;
        boolean isOpen = false;

        System.out.println("나이: " + age);
        System.out.println("체온: " + temperature);
        System.out.println("영업 여부: " + isOpen);
    }
}

삼항 연산자 활용
public class OperatorExample {
    public static void main(String[] args) {
        int x = 12, y = 5;

        System.out.println("합: " + (x + y));
        System.out.println("차: " + (x - y));
        System.out.println("곱: " + (x * y));
        System.out.println("몫: " + (x / y));
        System.out.println("나머지: " + (x % y));
    }
}
 */