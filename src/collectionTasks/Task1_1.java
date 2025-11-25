package collectionTasks;
import java.util.*;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + course;
    }
}

public class Task1_1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Aman", "Java"));
        list.add(new Student(2, "Neha", "Python"));
        list.add(new Student(1, "Aman", "Java")); // Duplicate
        list.add(new Student(3, "Rohit", "C++"));
        list.add(new Student(2, "Neha", "Python")); // Duplicate

        System.out.println("Original List:");
        System.out.println(list);

        Set<Student> uniqueSet = new HashSet<>(list);

        System.out.println("After Removing Duplicates:");
        System.out.println(uniqueSet);
    }
}