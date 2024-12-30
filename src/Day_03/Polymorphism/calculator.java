package Day_03.Polymorphism;

public class calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
class Main{
    public static void main(String args[]){
        calculator c=new calculator();
        System.out.println(c.add(11,17));
        System.out.println(c.add(11.6,17.8));
        System.out.println(c.add(11,17,68));
    }
}
