package Day_03.Inheritance_2;

public class Animal {
    public void sound(){
        System.out.println("Sounds like animal");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Bow Bow!");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow Meow!");
    }
}
class Mains{
    public static void main(String args[]){
        Animal d=new Dog();
        d.sound();
        Animal c=new Cat();
        c.sound();
    }
}
