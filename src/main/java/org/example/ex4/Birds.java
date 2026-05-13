package org.example.ex4;

public abstract class Birds extends Animal {
    private final double wingsSpan;

    public Birds(String name, double age, double wingsSpan) {
        super(name, age);

        if (wingsSpan <= 0) {
            throw new IllegalArgumentException("Wings span cannot be less or equal to 0.");
        }

        this.wingsSpan = wingsSpan;
    }
}
