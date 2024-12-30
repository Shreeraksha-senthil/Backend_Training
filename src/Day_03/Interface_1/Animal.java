package Day_03.Interface_1;

interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

class Main{
    public static void main(String args[]) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        dog.sleep();
        cat.eat();
        cat.sleep();
    }
}