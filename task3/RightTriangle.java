
package org.example.task3;

import java.util.Objects;

public class RightTriangle extends Triagle {
    private double cathetus1;
    private double cathetus2;
    private double hypotenuse;

    public RightTriangle(double cathetus1, double cathetus2, double hypotenuse) {
        super(cathetus1, cathetus2, hypotenuse);
        if (Math.abs(cathetus1*cathetus1 + cathetus2*cathetus2 - hypotenuse*hypotenuse) > 0.0001) {
            throw new IllegalArgumentException("Не прямоугольный треугольник");
        }
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double area() {
        return cathetus1 * cathetus2 / 2;
    }

    @Override
    public String getDescription() {
        return "прямоугольный треугольник: катеты " + cathetus1 + " и " + cathetus2
                + ", гипотенуза " + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + ", RightTriangle{cath1=" + cathetus1 + ", cath2=" + cathetus2 + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        RightTriangle that = (RightTriangle) o;
        return Double.compare(that.cathetus1, cathetus1) == 0 &&
                Double.compare(that.cathetus2, cathetus2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cathetus1, cathetus2);
    }
}