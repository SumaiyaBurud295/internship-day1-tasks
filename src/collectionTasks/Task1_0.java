package collectionTasks;
import java.util.*;

public class Task1_0 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman","Neha","Aman","Rohit","Neha","Sahil","Aman");

        System.out.println("Original List: " + names);

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Unique Set: " + uniqueNames);

        List<String> backToList = new ArrayList<>(uniqueNames);
        System.out.println("Back to List: " + backToList);
    }
}