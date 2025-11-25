package collectionTasks;
import java.util.*;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        System.out.println("Enter 5 city names:");
        for (int i = 0; i < 5; i++) {
            cities.add(sc.nextLine());
        }

        System.out.println("Cities in entered order without duplicates:");
        System.out.println(cities);
    }
}