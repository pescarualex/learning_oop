package org.example.ex4;

public abstract class Mammal extends Animal {
    private final String furColor;

    public Mammal(String name, double age, String furColor) {
        super(name, age);

        if (furColor == null || furColor.isBlank()) {
            throw new IllegalArgumentException("Fur color cannot be empty.");
        }

        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return super.toString() + "Mammal{" +
                "furColor='" + furColor + '\'' +
                '}';
    }
}
