package org.example.structural.adapter.tp.ex1;

public class PaymentAdapter implements OldPaymentGateway {

    private final NewPaymentProcessor newPaymentProcessor;

    public PaymentAdapter(NewPaymentProcessor newPaymentProcessor) {
        this.newPaymentProcessor = newPaymentProcessor;
    }
    @Override
    public void makePayment(String accountNumber, double amount) {
        newPaymentProcessor.sendPayment(amount);

    }
}
