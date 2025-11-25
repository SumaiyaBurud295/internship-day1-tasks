package studentcrudproject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperation {

    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // -------- SAFE INPUT FOR INT --------
    private int safeIntInput(String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            sc.next(); // remove wrong input
            System.out.print(message);
        }
        int value = sc.nextInt();
        sc.nextLine(); // clear buffer
        return value;
    }

    // -------- ADD STUDENT --------
    public void addStudent() {
        int id = safeIntInput("Enter ID: ");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        list.add(new Student(id, name, course));
        System.out.println("Student Added Successfully!");
    }

    // -------- DISPLAY STUDENTS --------
    public void showStudents() {
        if (list.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // -------- SEARCH STUDENT --------
    public void searchStudent() {
        int id = safeIntInput("Enter ID to Search: ");

        for (Student s : list) {
            if (s.getId() == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // -------- UPDATE STUDENT --------
    public void updateStudent() {
        int id = safeIntInput("Enter ID to Update: ");

        for (Student s : list) {
            if (s.getId() == id) {

                System.out.print("Enter New Name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter New Course: ");
                s.setCourse(sc.nextLine());

                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // -------- DELETE STUDENT --------
    public void deleteStudent() {
        int id = safeIntInput("Enter ID to Delete: ");

        for (Student s : list) {
            if (s.getId() == id) {
                list.remove(s);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        StudentOperation obj = new StudentOperation();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n---------- Student Management ----------");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) { // menu safe input
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                System.out.print("Enter your choice: ");
            }
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> obj.addStudent();
                case 2 -> obj.showStudents();
                case 3 -> obj.searchStudent();
                case 4 -> obj.updateStudent();
                case 5 -> obj.deleteStudent();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
