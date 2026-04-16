package com.apps.quantitymeasurement;

public class Length {

    private final double value;
    private final LengthUnit unit;

    // Enum inside class
    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

        private final double factor;

        LengthUnit(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    // Constructor
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert to base (inches)
    private double toBase() {
        return value * unit.getFactor();
    }

    // equals method
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        Length other = (Length) obj;

        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}