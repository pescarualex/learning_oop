package org.example.ex3;

public class CryptoPaymentProcessor implements PaymentProcessor{
    private final String walletAddress;

    public CryptoPaymentProcessor(String walletAddress){
        if (walletAddress == null || walletAddress.isBlank() || walletAddress.length() < 26){
            System.out.println("Incorrect wallet address.");
        }

        this.walletAddress = walletAddress;
    }

    @Override
    public PaymentResult process(double amount, String currency) {
        if (amount <= 10) {
            return new PaymentResult(false, "Amount too small for crypto transaction.");
        } else {
            return new PaymentResult(true, "Crypto payment processed.");
        }
    }
}
