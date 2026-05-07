package org.example.ex2;

public class SMS extends Notification {

    public SMS(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("[SMS] To: " + getRecipient() + " | Message: " +
                getMessage() + " | Sent at: " + getTimestamp());
    }
}
