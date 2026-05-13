package org.example.ex4;

public abstract class Bird extends Animal {
    private final double wingSpan;

    public Bird(String name, int age, double wingsSpan) {
        super(name, age);

        if (wingsSpan <= 0) {
            throw new IllegalArgumentException("Wings span cannot be less or equal to 0.");
        }

        this.wingSpan = wingsSpan;
    }

    @Override
    public String toString() {
        return super.toString() + "Birds{" +
                "wingsSpan=" + wingSpan +
                '}';
    }
}
