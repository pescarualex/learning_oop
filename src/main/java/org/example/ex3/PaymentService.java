package org.example.ex3;

public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }


    public PaymentResult pay(double amount, String currency) throws InvalidPaymentException {
        if (amount <= 0) {
            throw new InvalidPaymentException("The amount cannot be less or equal with 0");
        }

        if (currency == null || currency.isBlank()) {
            throw new InvalidPaymentException("Invalid currency.");
        }

        return paymentProcessor.process(amount, currency);
    }
}
