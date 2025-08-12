package org.example.Head02_OOPprogramming.OppPG.Exam.Pay;

public class Order {
    private AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    public void cancle(double amount) {
        payment.cancle(amount);
    }
}