package org.example.ex3;

import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentResult {
    private final boolean success;
    private final String transactionId;
    private final String message;
    private final LocalDateTime timestamp;

    public PaymentResult(boolean success, String message) {
        this.success = success;
        this.transactionId = UUID.randomUUID().toString();
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public boolean isSuccess() {
        return success;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "PaymentResult{" +
                "success=" + success +
                ", transactionId='" + transactionId + '\'' +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
