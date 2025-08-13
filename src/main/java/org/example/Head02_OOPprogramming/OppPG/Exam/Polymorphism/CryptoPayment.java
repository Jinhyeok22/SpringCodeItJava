package org.example.Head02_OOPprogramming.OppPG.Exam.Polymorphism;

import org.example.Head02_OOPprogramming.example05.Payment;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("크라이포토결제");
    }
}
