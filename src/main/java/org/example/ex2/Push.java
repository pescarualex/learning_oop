package org.example.ex2;

public class Push extends Notification implements Loggable {
    private final String deviceToken;

    public Push(String deviceToken, String message) {
        if (deviceToken == null || deviceToken.isBlank()) {
            throw new IllegalArgumentException("Device Token cannot be empty.");
        }

        super(deviceToken, message);
        this.deviceToken = deviceToken;
    }

    @Override
    public void send() {
        System.out.println("[PUSH] Device: " + getRecipient() + " | Message: " +
                getMessage() + " | Sent at: " + getTimestamp());
    }

    @Override
    public void logToConsole() {
        System.out.println("[LOG] Notification to device " + deviceToken + " at " + getTimestamp() + " sent.");
    }
}
