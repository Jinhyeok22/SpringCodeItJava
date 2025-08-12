package org.example.Head02_OOPprogramming.example05;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("현금으로 " +amount+ "결제 완료.");
    }
}
