package org.example.ex3;

public class PayPalPaymentProcessor implements PaymentProcessor {
    private final String email;

    public PayPalPaymentProcessor(String email) throws InvalidPaymentException {
        if (email == null || email.isBlank() || !email.matches("^[^@]+@[^@]+$")) {
            throw new InvalidPaymentException("Incorrect email");
        }

        this.email = email;
    }

    @Override
    public PaymentResult process(double amount, String currency) {
        return new PaymentResult(true, "PayPal payment processed with amount: " + amount + " " + currency);
    }
}
