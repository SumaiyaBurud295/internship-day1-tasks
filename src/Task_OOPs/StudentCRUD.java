package Task_OOPs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class Student4 {
    private Connection conn;

    // Constructor: Connect to DB and clear table
    Student4() throws Exception, SQLException {
        Class.forName("org.postgresql.Driver");

        conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/internship_day1",
                "postgres",
                "sumaiya"
        );
        System.out.println("PostgresSQL Database Connected!");

        // Clear table to avoid duplicates
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM students");
        System.out.println("Table cleared!\n");
    }

    // Insert student
    public void insertStudent(String newName, int newAge) throws SQLException {
        String query = "INSERT INTO students (name, age) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, newName);
        ps.setInt(2, newAge);
        ps.executeUpdate();
        System.out.println("Inserted [ Name: \"" + newName + "\", Age: " + newAge + " ].");
    }

    // Get all students and return their IDs
    public List<Integer> getAllStudents() throws Exception, SQLException {
        String query = "SELECT * FROM students";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        List<Integer> ids = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            ids.add(id);
            System.out.println(id + " | " + name + " | " + age + " | ");
        }
        return ids;
    }

    // Update student by ID
    public void updateStudent(int id, String newName, int newAge) throws Exception, SQLException {
        String query = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, newName);
        ps.setInt(2, newAge);
        ps.setInt(3, id);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Updated student with [ id = " + id + " ]");
        } else {
            System.out.println("No student found with [ id = " + id + " ]");
        }
    }

    // Delete student by ID
    public void deleteStudent(int id) throws Exception, SQLException {
        String query = "DELETE FROM students WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Deleted student with [ id = " + id + " ]");
        } else {
            System.out.println("No student found with [ id = " + id + " ]");
        }
    }
}

public class StudentCRUD {
    public static void main(String[] args) throws Exception, SQLException {
        Student4 s1 = new Student4();
        System.out.println();

        // Insert Operations
        s1.insertStudent("Sumaiya Burud", 20);
        s1.insertStudent("Saniya Qazi", 21);
        s1.insertStudent("Simran Sayyed", 20);

        System.out.println("-----------------------------------------------------");

        // Select All Operation
        List<Integer> ids = s1.getAllStudents();

        System.out.println("-----------------------------------------------------\n");

        // Update first two students dynamically if exist
        if (ids.size() >= 2) {
            s1.updateStudent(ids.get(0), "Aafiya Shaikh", 22);
            s1.updateStudent(ids.get(1), "Ayesha Dawre", 20);
        }

        System.out.println("-----------------------------------------------------");

        s1.getAllStudents();

        System.out.println("-----------------------------------------------------\n");

        // Delete last two students dynamically if exist
        if (ids.size() >= 2) {
            s1.deleteStudent(ids.get(ids.size() - 1));
            s1.deleteStudent(ids.get(ids.size() - 2));
        }

        System.out.println("-----------------------------------------------------");

        s1.getAllStudents();

        System.out.println("-----------------------------------------------------\n");
    }
}
