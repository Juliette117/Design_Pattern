package org.example.structural.decorator.tp;

public  abstract class NotificationDecorator implements Notification {

    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }


    @Override
    public String getNotification() {
        return notification.getNotification();
    }
}
