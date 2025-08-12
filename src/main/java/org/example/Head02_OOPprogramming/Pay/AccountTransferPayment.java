package org.example.Head02_OOPprogramming.Pay;

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
    @Override
    public void cancle(double amount) {
        System.out.println(amount+"원 결제 취소.");
    }
}

