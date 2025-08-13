package org.example.Head02_OOPprogramming.OppPG.Exam.DIP;

public class NotificationService {
    private final NotificationSendor sender;

    public NotificationService(NotificationSendor sender) {
        this.sender = sender;
    }

    public void notify(String message) {
        sender.send(message);
    }
}
