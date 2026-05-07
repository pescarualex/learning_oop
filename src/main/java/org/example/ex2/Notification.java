package org.example.ex2;

import java.time.LocalDateTime;

public abstract class Notification {
    private String recipient;
    private final String message;
    private final LocalDateTime timestamp;

    public Notification(String recipient, String message) {
        if (recipient.isEmpty() || recipient == null) {
            throw new IllegalArgumentException("Recipient cannot be empty.");
        }

        if (message.isEmpty() || message == null) {
            throw new IllegalArgumentException("Message cannot be empty");
        }

        this.recipient = recipient;
        this.message = message;
        timestamp = LocalDateTime.now();
    }

    public Notification(String message) {
        if (message.isEmpty() || message == null) {
            throw new IllegalArgumentException("Message cannot be empty");
        }

        this.message = message;
        timestamp = LocalDateTime.now();
    }

    public abstract void send();

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "recipient='" + recipient + '\'' +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
