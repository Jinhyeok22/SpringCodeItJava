package org.example.Head01_JavaProgrammingStart.example02;

public class OperatorExample {
    public static void main(String[] args) {
        double temperature = 50;

        String gender = "male";

       if(temperature > 40) {
           System.out.println("폭염입니다 . ");
            if(gender.equals("male")) {
                System.out.println("남자인데");
            }
                else {
                    System.out.println("여자인데");
                }
        }
        else if (temperature <= 40 && temperature > 20) {
            System.out.println("So Hot ");
        }
            else if(temperature <= 20 && temperature > 10) {
            System.out.println("So fresh, SO cool ");
        }
                else {
            System.out.println("Freezing Cold");
        }
    }
}

