package Day_03.Polymorphism;

public class Employee {
    public void calculateSalary() {
        System.out.println("Employee Salary...");
    }
}
class Manager extends Employee {
    private double salary;
    private double bonus;
    Manager(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    @Override
    public void calculateSalary() {
        double totalsalary = salary + bonus;
        System.out.println("Manager Salary: " + totalsalary);
    }
}

class Developer extends Employee{
    private double salary;
    private double bonus;
    Developer(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;

    }
    @Override
    public void calculateSalary() {
        double totalsalary = salary + bonus;
        System.out.println("Developer Salary: " + totalsalary);
    }
}
class Main1{
    public static void main(String[] args) {
        Manager m = new Manager(90000, 40000);
        m.calculateSalary();

        Developer d = new Developer(60000, 10000);
        d.calculateSalary();
    }
}
