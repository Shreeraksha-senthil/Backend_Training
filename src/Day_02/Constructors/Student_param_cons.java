package Day_02.Constructors;

public class Student_param_cons {
    String name;
    int age;
    Student_param_cons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student_param_cons student1 = new Student_param_cons("Sita", 25);
        Student_param_cons student2 = new Student_param_cons("Ram", 26);
        System.out.println();
        student1.display();
        student2.display();
    }
}