package org.example.structural.decorator.tp;

public class SendMessageLoggingDecorator extends NotificationDecorator {


    public SendMessageLoggingDecorator(Notification notification) {
        super(notification);
    }



    @Override
    public String getNotification() {
        return "journalisation, " + notification.getNotification();
    }
}
