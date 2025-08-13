package org.example.Head02_OOPprogramming.SOLID;

public class MobilePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("모바일 결제:"+amount+"원");
    }
}
