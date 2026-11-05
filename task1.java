import static java.lang.Math.pow;

public class Triangle {
        private double x1, y1;
        private double x2, y2;
        private double x3, y3;


    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;

        if (square() == 0) {
            throw new IllegalArgumentException("Вырожденный треугольник");}
    }

    public double side1() {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }

    public double side2() {
        return Math.sqrt(Math.pow(this.x3 - this.x2, 2) + Math.pow(this.y3 - this.y2, 2));
    }

    public double side3() {
        return Math.sqrt(Math.pow(this.x3 - this.x1, 2) + Math.pow(this.y3 - this.y1, 2));
    }

    public double perimeter() {
        return side1() + side2() + side3();
    }

    public double square() {
        double s1 = side1(), s2 = side2(), s3 = side3();
        double halfPerimeter = (s1 + s2 + s3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - s1) * (halfPerimeter - s2) * (halfPerimeter - s3));
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(0, 0, 4, 0, 0, 3);
        System.out.println("треугольник 1:");
        System.out.println("периметр: " + t1.perimeter());
        System.out.println("площадь: " + t1.square());

        try {
            Triangle t2 = new Triangle(0, 0, 1, 1, 2, 2);
            System.out.println("f");
        } catch (IllegalArgumentException e) {
            System.out.println("\nошибка: " + e.getMessage());
        }
    }

}
