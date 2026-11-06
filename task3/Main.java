package org.example.task3;

public class Main {
    public static void main(String[] args) {
        Triagle t = new RightTriangle(3, 4, 5);
        System.out.println(t.getDescription());

        Triagle[] triangles = {
                new Triagle(3, 4, 5),
                new RightTriangle(3, 4, 5),
                new EquilateralTriangle(6),
                new RightTriangle(5, 12, 13)
        };

        for (Triagle triangle : triangles) {
            System.out.println(triangle.getDescription());
            System.out.println("  Периметр: " + triangle.perimeter());
            System.out.println("  Площадь: " + triangle.area());
            System.out.println();
        }

        Triagle t1 = new RightTriangle(3, 4, 5);
        Triagle t2 = new RightTriangle(3, 4, 5);
        System.out.println("t1.equals(t2): " + t1.equals(t2));
        System.out.println("hashCode t1: " + t1.hashCode());
        System.out.println("hashCode t2: " + t2.hashCode());
    }


}

/**
 ИНКАПСУЛЯЦИЯ:
            Поля классов объявлены как private — они скрыты от внешнего кода.
            Доступ только через геттеры (getA(), getB(), getC()).
 НАСЛЕДОВАНИЕ:
            Классы RightTriangle и EquilateralTriangle наследуют от Triagle
            Им не нужно заново писать perimeter() — они берут его от родителя.
 ПЕРЕОПРЕДЕЛЕНИЕ (OVERRIDE):
            Метод area() в базовом классе считает площадь по формуле Герона.
            В RightTriangle он переопределён — используется формула a*b/2.
            В EquilateralTriangle — формула (√3/4)*a².
 ПОЛИМОРФИЗМ:
            В массиве Triangle[] хранятся объекты разных типов.
            Когда мы вызываем triangle.area() в цикле, Java сама определяет,
                какой версии метода вызвать — базовой или переопределённой.
**/
