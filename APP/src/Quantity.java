public class Quantity {
    private final double value;

    public Quantity(double value) {
        this.value = value;
    }

    public boolean equals(Quantity other) {
        return this.value == other.value;
    }
}