package org.example.Head02_OOPprogramming.example06;

public abstract class AbstractPayment {
    // 공통 검증 로직
    protected void validatePayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("결제 금액이 유효하지 않습니다.");
        }
    }

    // 공통 취소 검증 로직
    protected void validateCancel(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("취소 금액이 유효하지 않습니다.");
        }
    }

    public abstract void pay(double amount);

    public abstract void cancel(double amount);
    }
