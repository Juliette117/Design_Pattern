package org.example.structural.decorator.tp;

public class ContentEncryptionDecorator extends NotificationDecorator {

    public ContentEncryptionDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getNotification() {
        return "chiffrement, " + notification.getNotification();
    }
}
