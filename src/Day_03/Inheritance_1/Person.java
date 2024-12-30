package Day_03.Inheritance_1;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Student extends Person{
    int rollNumber;
    int marks;

    Student(String name, int age, int rollNumber,int marks){
        super(name,age);
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public void display(){
        super.display();
        System.out.println("RollNumber:"+rollNumber);
        System.out.println("Marks:"+marks);
    }
}
class Main{
    public static void main(String args[]){
        Student stu1=new Student("Shreeraksha",20,61,90);
        stu1.display();
    }
}
