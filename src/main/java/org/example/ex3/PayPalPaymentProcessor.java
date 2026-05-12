package org.example.ex3;

public class PayPalPaymentProcessor implements PaymentProcessor{
    private final String email;

    public PayPalPaymentProcessor(String email){
        if (email == null || email.isBlank() || !email.matches("^[^@]+@[^@]+$")){
            System.out.println("Incorrect email");
        }

        this.email = email;
    }

    @Override
    public PaymentResult process(double amount, String currency) {
        if (!email.matches("^[^@]+@[^@]+$")){
            return new PaymentResult(false, "Incorrect email.");
        } else {
            return new PaymentResult(true, "PayPal payment processed.");
        }
    }
}
