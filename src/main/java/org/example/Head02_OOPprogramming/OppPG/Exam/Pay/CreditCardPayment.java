package org.example.Head02_OOPprogramming.OppPG.Exam.Pay;

public class CreditCardPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
    @Override
    public void cancle(double amount) {
        System.out.println(amount+"원 결제 취소.");
}
    }
