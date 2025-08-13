package org.example.Head02_OOPprogramming.OppPG.Exam.DIP;

public class DipTest {
    public static void main(String[] args) {
        NotificationSendor[] notificationSendors = new NotificationSendor[]{
                new EmailNotificationSender(),
                new SmsNotificationSender()
        };
        for(NotificationSendor notificationSendor : notificationSendors) {
            NotificationService notificationService = new NotificationService(notificationSendor);
            notificationService.notify("Hello World");
        }
    }
}
