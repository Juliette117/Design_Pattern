package org.example.structural.adapter.tp.ex2;

public class NotificationAdapter implements SmsService {

    private final EmailService emailService;
    private final ContactDirectory directory;

    public NotificationAdapter(EmailService emailService, ContactDirectory directory) {
        this.emailService = emailService;
        this.directory = directory;
    }
    @Override
    public void sendSms(String phoneNumber, String message) {
        String email = directory.getEmail(phoneNumber);

        if (email == null) {
            System.out.println("Aucun email associé au " + phoneNumber);
        }


    }
}
