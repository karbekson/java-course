package tech.dar.practice7.geometry;

public class Circle extends Figure {

    int r;

    public Circle(int r) {
        this.r = r;
    }

    public double calculateArea() {
        return Math.round(3.14 * r * r * 10) / 10.0;
    }

    public double calculatePerimeter() {
        return Math.round(3.14 * r * 2 * 10) / 10.0;
    }

}
