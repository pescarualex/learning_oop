package org.example;

import org.example.ex3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() throws InvalidPaymentException {


//        ex3
        PaymentProcessor cardPaymentProcessor = new CardPaymentProcessor("1234567891012131");
        PaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessor("alex@gmail.com");
        PaymentProcessor cryptoPaymentProcessor = new CryptoPaymentProcessor("1h2ysbdh3y4hdbshdyetdgsbdgchtucjd");

        PaymentService cardPaymentService = new PaymentService(cardPaymentProcessor);
        PaymentService payPalPaymentService = new PaymentService(payPalPaymentProcessor);
        PaymentService cryptoPaymentService = new PaymentService(cryptoPaymentProcessor);

        PaymentResult cardPaymentResult = cardPaymentService.pay(100.50, "RON");
        PaymentResult payPalPaymentResult = payPalPaymentService.pay(50.00, "EUR");
        PaymentResult cryptoFailPaymentResult = cryptoPaymentService.pay(5.00, "USD");
        PaymentResult cryptoPaymentResult = cryptoPaymentService.pay(100.00, "USD");

        List<PaymentResult> paymentResults = new ArrayList<>();
        paymentResults.add(cardPaymentResult);
        paymentResults.add(payPalPaymentResult);
        paymentResults.add(cryptoFailPaymentResult);
        paymentResults.add(cryptoPaymentResult);

        for (PaymentResult paymentResult : paymentResults) {
            System.out.println("Transaction ID: " + paymentResult.getTransactionId() + ", Is success: " + paymentResult.isSuccess() + ", Message: " + paymentResult.getMessage() + ", Timestamp: " + paymentResult.getTimestamp());
        }


    }
}
