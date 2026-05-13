package org.example.ex4;

public abstract class Bird extends Animal {
    private final double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);

        if (wingSpan <= 0) {
            throw new IllegalArgumentException("Wingspan cannot be less or equal to 0.");
        }

        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return super.toString() + "Bird{" +
                "wingSpan=" + wingSpan +
                '}';
    }
}
