package Task_OOPs;
class Person {
    String name;
    int age;

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class 1
class Student1 extends Person {
    String course;

    void showStudent() {
        showInfo();
        System.out.println("Course: " + course);
    }
}

// Child Class 2
class Employee1 extends Person {
    double salary;

    void showEmployee() {
        showInfo();
        System.out.println("Salary: " + salary);
    }
}

// Main Class
public class InheritanceDemo {
    public static void main(String[] args) {

        // Student Object
        Student1 s = new Student1();
        s.name = "Safa";
        s.age = 19;
        s.course = "Computer Science";

        System.out.println("--- Student Details ---");
        s.showStudent();


        // Employee Object
        Employee1 e = new Employee1();
        e.name = "Aiman";
        e.age = 22;
        e.salary = 25000;

        System.out.println("\n--- Employee Details ---");
        e.showEmployee();
    }
}