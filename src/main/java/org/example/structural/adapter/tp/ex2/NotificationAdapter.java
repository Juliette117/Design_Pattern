package org.example.structural.adapter.tp.ex2;

public class NotificationAdapter implements SmsService {

    private EmailService emailService;

    public NotificationAdapter(EmailService emailService) {
        this.emailService = emailService;
    }
    @Override
    public void sendSms(String number, String message) {

    }
}
