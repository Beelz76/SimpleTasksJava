/*Создать не менее трёх классов, которые будут описывать различные геометрические фигуры предварительно согласовав их с преподавателем (например, треугольник, квадрат и круг).
Предусмотреть наличие у фигур таких характеристик, как цвет, линейные размеры, площадь, возможно объём.
В программе должен быть абстрактный класс с названием Figure, на основе которого создаются производные классы фигур.
В главном методе реализовать создание объектов производных классов и продемонстрировать, как получить доступ к объектам через объектные переменные подклассов и через объектную переменную абстрактного суперкласса.*/

import java.text.DecimalFormat;

abstract class Figure {
    private String color;

    public Figure (String color) {
        this.color = color;
    }

    public abstract void showArea();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Triangle extends Figure {
    private double height;
    private double base;

    public Triangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double getBase() {
        return base;
    }

    public void showArea() {
        System.out.println("Площадь треугольника = " + 0.5 * height * base);
    }
}

class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void showArea() {
        System.out.println("Площадь квадрата = " + side * side);
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void showArea() {
        DecimalFormat myFormat = new DecimalFormat("#.##");
        System.out.println("Площадь круга = " + myFormat.format(Math.PI * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        //Доступ к полям и методам объектов через объектные переменные подклассов
        Triangle triangle = new Triangle("Красный", 5, 6);
        Square square = new Square("Желтый", 7);
        Circle circle = new Circle("Зеленый", 5);

        triangle.showArea();
        System.out.println("Цвет треугольника - " + triangle.getColor() + "\n");

        square.showArea();
        System.out.println("Цвет квадрата - " + square.getColor() + "\n");

        circle.showArea();
        System.out.println("Цвет круга - " + circle.getColor() + "\n");

        //Доступ к полям и методам объектов через объектную переменную абстрактного класса
        Figure figure = triangle;

        System.out.println();
        figure.showArea();
        System.out.println("Цвет треугольника - " + figure.getColor() + "\n");

        figure = square;
        figure.showArea();
        System.out.println("Цвет квадрата - " + figure.getColor() + "\n");

        figure = circle;
        figure.showArea();
        System.out.println("Цвет круга - " + figure.getColor() + "\n");
    }
}

