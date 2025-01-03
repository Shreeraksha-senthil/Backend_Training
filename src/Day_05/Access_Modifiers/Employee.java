package Day_05.Access_Modifiers;

public class Employee extends Person {
    public Employee(String name, int age, String address, double salary) {
        super(name, age, address, salary);
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        // System.out.println("Salary: " + salary); // Not accessible private
    }
}
