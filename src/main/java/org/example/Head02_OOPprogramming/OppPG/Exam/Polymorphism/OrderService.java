package org.example.Head02_OOPprogramming.OppPG.Exam.Polymorphism;

import org.example.Head02_OOPprogramming.example05.Payment;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}

