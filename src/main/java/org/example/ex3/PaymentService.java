package org.example.ex3;

public class PaymentService{
    final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }


    public void pay(double amount, String currency) throws InvalidPaymentException {
        if (amount < 0) {
            throw new InvalidPaymentException("The amount cannot be less than 0");
        }

        if (currency == null || currency.isBlank()){
            throw new InvalidPaymentException("Invalid currency.");
        }

        PaymentResult process = paymentProcessor.process(amount, currency);
        System.out.println("Transaction ID: " + process.getTransactionId() +
                            ", Is success: " + process.isSuccess() +
                            ", Message: " + process.getMessage() +
                            ", Timestamp: " + process.getTimestamp());
    }
}
