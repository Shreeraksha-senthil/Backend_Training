package Day_03.Inheritance_2;

import org.w3c.dom.css.Rect;

public class Shape {
    public void area(){
        System.out.println("Area of shape");
    }
}
class Rectange extends Shape{
    int length;
    int breadth;
    public Rectange(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle :"+length*breadth);
    }
}
class Square extends Rectange{
    int side;
    public Square(int side){
        super(side,side);
    }

    @Override
    public void area() {
        System.out.println("Area of Square :"+length*length);
    }
}
class Main{
    public static void main(String args[]){
        Rectange rec=new Rectange(6,8);
        rec.area();
        Square sq=new Square(6);
        sq.area();
    }
}
