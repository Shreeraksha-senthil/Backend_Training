package Day_06.Clone;

class Student implements Cloneable {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Student originalStudent = new Student("John", 30);
        Student clonedStudent = (Student) originalStudent.clone();
        System.out.println("Original Student: " + originalStudent);
        System.out.println("Cloned Student: " + clonedStudent);
    }
}
