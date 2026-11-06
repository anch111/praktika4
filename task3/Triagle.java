package org.example.task3;

import java.util.Objects;

import static java.lang.Math.pow;

public class Triagle {
    private double a;
    private double b;
    private double c;

    public Triagle(double a, double b, double c){

        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalArgumentException("стороны должны быть ненулевыми");
        }

        if (a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalArgumentException("такой треугольник не сущетсвует");
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}

    public double perimeter(){return a + b + c;}
    public double area(){
        double half_perimeter = perimeter() / 2;
        double area = pow((half_perimeter * (half_perimeter-a) * (half_perimeter - b) * (half_perimeter - c)), 0.5);
        return area;
    }

    public String getDescription(){
        return "треугольник со сторонами a = " + a + ", b = " + b + ", c = " + c;
    }

    @Override
    public String toString(){
        return "Triangle{a=" + a + ", b=" + b + ", c=" + c + "}";
    }

    @Override
    public boolean equals(Object other){
        if (this == other){return true;}
        if (other == null || other.getClass() != getClass()){return false;}
        Triagle triagle = (Triagle) other;
        return Double.compare(a, triagle.a) == 0 && Double.compare(b, triagle.b) == 0 && Double.compare(c, triagle.c) == 0;
    }

    @Override
    public int hashCode(){
        return Objects.hash(a, b, c);
    }



}

