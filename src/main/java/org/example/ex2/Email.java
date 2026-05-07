package org.example.ex2;

public class Email extends Notification implements Loggable {
    private final String subject;

    public Email(String recipient, String subject, String message) {
        if (subject.isEmpty() || subject == null) {
            throw new IllegalArgumentException("Subject cannot be empty.");
        }

        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("[EMAIL] To: " + getRecipient() + " | Subject: " + subject +
                " | Body: " + getMessage() + " | Sent at: " + getTimestamp());
    }

    @Override
    public void logToConsole() {
        System.out.println("[LOG] Notification to " + getRecipient() + " at " + getTimestamp() + " sent.");
    }
}
