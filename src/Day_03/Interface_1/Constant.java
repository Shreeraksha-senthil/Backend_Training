package Day_03.Interface_1;

interface Constant {
    static double PI=3.14;
}

class Circle implements Constant {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea()
    {
        double area=PI*radius*radius;
        System.out.println("Area of Circle : " +area);
        return area;
    }
}
class Mains{
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.calculateArea();
    }
}