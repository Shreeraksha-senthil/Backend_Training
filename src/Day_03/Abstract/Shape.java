package Day_03.Abstract;

public abstract class Shape {
    public abstract void calculateArea();
}
class Circle extends Shape
{
    private double rad;
    public Circle(double rad) {
        this.rad = rad;
    }
    public void calculateArea() {
        double area = Math.PI * rad * rad;
        System.out.println("Area of circle: " + area);
    }
}

class Rectangle extends Shape
{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
class Main{
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        circle.calculateArea();
        Shape rectangle = new Rectangle(6, 8);
        rectangle.calculateArea();
    }
}
