package tech.dar.practice7.geometry;

public class Rectangle extends Figure {

    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return a * b;
    }

    public double calculatePerimeter() {
        return (a + b) * 2;
    }

}
