package Day_03.Inheritance_1;

public class vehicle {
    String name;
    int year;
    public vehicle(String name, int year){
        this.name= name;
        this.year= year;
    }
    public void start(){
        System.out.println(this.name+" is running");
    }
}
class Car extends vehicle {
    public Car(String name, int year) {
        super(name, year);
    }

    @Override
    public void start() {
        System.out.println(this.name+" is running smoothly");
    }
}
class Mains{
    public static void main(String args[]){
        Car car=new Car("ScorpioN",2024);
        car.start();
    }
}
