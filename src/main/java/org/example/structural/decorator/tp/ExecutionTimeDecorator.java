package org.example.structural.decorator.tp;

public class ExecutionTimeDecorator extends NotificationDecorator {
    public ExecutionTimeDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getNotification() {
        return "Mesure du temps d'execution, " + notification.getNotification();
    }

}
