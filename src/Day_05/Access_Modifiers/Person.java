package Day_05.Access_Modifiers;

public class Person {
    public String name;
    protected int age;
    String address; // Default access modifier (package-private)
    private double salary;

    public Person(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
}
