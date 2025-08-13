package org.example.Head02_OOPprogramming.OppPG.Exam.DIP;

public class SmsNotificationSender implements NotificationSendor{
    @Override
    public void send(String message) {
        System.out.println("SMS 전송: " + message  );
    }
}
