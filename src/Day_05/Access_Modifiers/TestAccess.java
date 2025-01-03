package Day_05.Access_Modifiers;

import Day_05.Access_Modifiers.Person;

public class TestAccess {
    public static void main(String[] args) {
        Person person = new Person("John", 30, "123 city", 50000);
        // System.out.println(person.age); // Not accessible: protected
        // System.out.println(person.address); // Not accessible: default (different package)
        // System.out.println(person.salary); // Not accessible: private

        Employee employee = new Employee("Jane ", 25, "456 city", 60000);
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.address);
        // System.out.println(employee.salary); // Not accessible: private
    }
}
