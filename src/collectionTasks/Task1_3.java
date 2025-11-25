package collectionTasks;
import java.util.*;

public class Task1_3 {
    public static void main(String[] args) {
        TreeSet<Integer> prices = new TreeSet<>();
        prices.add(120);
        prices.add(50);
        prices.add(300);
        prices.add(50);
        prices.add(200);

        System.out.println("Sorted Prices: " + prices);
    }
}