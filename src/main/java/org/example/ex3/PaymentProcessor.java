package org.example.ex3;

public interface PaymentProcessor {
    PaymentResult process(double amount, String currency) throws InvalidPaymentException;
}
