package org.example.structural.decorator.tp;

public class SimpleNotification implements Notification{

    @Override
    public String getNotification() {
        return "Vous avez un nouveau message";
    }
}
