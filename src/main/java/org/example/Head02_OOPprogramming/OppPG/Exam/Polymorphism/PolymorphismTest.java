package org.example.Head02_OOPprogramming.OppPG.Exam.Polymorphism;

import org.example.Head02_OOPprogramming.example05.AccountTransferPayment;
import org.example.Head02_OOPprogramming.example05.CreditCardPayment;
import org.example.Head02_OOPprogramming.example05.Payment;

public class PolymorphismTest {
    public static void main(String[] args) {
        Payment[] payments = new Payment[]
                {
                        new CreditCardPayment(),
                        new AccountTransferPayment(),
                        new CryptoPayment()
                };
        double[] paymentAmounts = new double[] {
                30000,
                70000,
                100000
        };
        OrderService service = new OrderService();
        for (Payment payment : payments) {
            if(payment instanceof CreditCardPayment) {
                service.processPayment(payment, paymentAmounts[0]);
            } else if(payment instanceof AccountTransferPayment) {
                service.processPayment(payment, paymentAmounts[1]);
            } else if(payment instanceof Payment) {}
        }
    }
}
