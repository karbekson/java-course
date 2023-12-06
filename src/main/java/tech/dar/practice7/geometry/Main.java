package tech.dar.practice7.geometry;

public class Main {
    public static void main(String[] args) {


        Figure triangle = new Triangle(3, 4, 5);
        Figure rectangle = new Rectangle(5, 8);
        Figure circle = new Circle(3);

        System.out.println(
                "Triangle: p = " + triangle.calculatePerimeter() + ", s = " + triangle.calculateArea()
        );
        System.out.println(
                "Rectangle: p = " + rectangle.calculatePerimeter() + ", s = " + rectangle.calculateArea()
        );
        System.out.println(
                "Circle: p = " + circle.calculatePerimeter() + ", s = " + circle.calculateArea()
        );

    }

}
