package org.example.tr;

import java.util.Objects;

public class EquilateralTriangle extends Triagle{

    private double side;

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public String getDescription() {
        return "равоносторонний треугольник со стороной " + side;
    }

    @Override
    public String toString() {
        return super.toString() + ", EquilateralTriangle{side=" + side + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        EquilateralTriangle that = (EquilateralTriangle) o;
        return Double.compare(that.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
