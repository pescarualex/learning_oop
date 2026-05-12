package org.example.ex3;

public class CardPaymentProcessor implements PaymentProcessor {
    private final String cardNumber;

    public CardPaymentProcessor(String cardNumber) throws InvalidPaymentException {
        if (cardNumber == null || cardNumber.isBlank()) {
            throw new InvalidPaymentException("Card number incorrect.");
        }

        if (cardNumber.length() < 13) {
            throw new IllegalArgumentException("Card number incorrect");
        } else {
            this.cardNumber = cardNumber;
        }
    }

    @Override
    public PaymentResult process(double amount, String currency) {
        return new PaymentResult(true, "Card payment (**** " + cardNumber.substring(cardNumber.length() - 4) + ") processed with amount: " + amount + " " + currency);
    }
}
