package Day_03.Interface_2;

interface Vehicle {
    void start();
}
interface FourWheeler extends Vehicle {
    void turnOnAc();
}
interface TwoWheeler extends Vehicle {
    void Fuel();
}

class Car implements FourWheeler {
    @Override
    public void start() {
        System.out.println("Car starting");
    }
    @Override
    public void turnOnAc()
    {
        System.out.println("AC turning on");
    }
}

class Bike implements TwoWheeler {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
    @Override
    public void Fuel() {
        System.out.println("Fuel is empty");
    }
}

class Main1{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.turnOnAc();
        Bike bike = new Bike();
        bike.start();
        bike.Fuel();
    }
}