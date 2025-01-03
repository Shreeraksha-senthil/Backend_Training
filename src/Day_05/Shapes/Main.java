package Day_05.Shapes;

import Day_05.Shapes.Circle;
import Day_05.Shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of circle: " + circle.calculateArea());
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
