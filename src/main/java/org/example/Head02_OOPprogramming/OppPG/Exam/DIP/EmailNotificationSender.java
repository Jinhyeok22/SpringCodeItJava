package org.example.Head02_OOPprogramming.OppPG.Exam.DIP;

public class EmailNotificationSender implements NotificationSendor {
    @Override
    public void send(String message) {
        System.out.println("이메일 전송: " + message);
    }
}
