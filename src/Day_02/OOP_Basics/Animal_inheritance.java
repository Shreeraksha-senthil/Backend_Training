package Day_02.OOP_Basics;

class Animal {
    public void speak() {
        System.out.println("I'm speaking animal");
    }
}


class Dog extends Animal {
    public void speak() {
        System.out.println("I'm speaking dog");
    }

}

class Cat extends Animal {
    public void speak() {
        System.out.println("I'm speaking cat");
    }
}

public class Animal_inheritance
{
    public static void main(String args[]) {
        Dog d = new Dog();
        d.speak();
        Cat c = new Cat();
        c.speak();
    }
}
