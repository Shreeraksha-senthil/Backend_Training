package Day_02.Constructors;

public class Employee {
    int id;
    String name;
    int salary;

    Employee() {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display(int id, String name, int salary) {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display(1, "Shree", 25000);
    }
}
