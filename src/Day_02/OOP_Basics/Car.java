package Day_02.OOP_Basics;

public class Car{
    private  String brand;
    private String model;
    private int price;
    Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display()
    {
        System.out.println("CAR DETAILS :");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

    }

    public int discounted_price()
    {
        int discounted_price = 10;
        int finalPrice = price - (price * discounted_price / 100);
        System.out.println(finalPrice);
        return finalPrice;
    }
    public static void main(String[] args) {
        Car c1=new Car("Audi","2024",50000);
        c1.display();
        c1.discounted_price();
    }
}
