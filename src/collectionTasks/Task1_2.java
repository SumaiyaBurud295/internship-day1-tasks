package collectionTasks;
import java.util.*;

public class Task1_2 {
    public static void main(String[] args) {
        List<String> ips = Arrays.asList(
                "192.168.0.1","192.168.0.2","192.168.0.1",
                "192.168.1.1","192.168.0.2","10.0.0.5",
                "10.0.0.5","172.16.0.1","172.16.0.1","192.168.0.3"
        );

        System.out.println("Original IP List: " + ips);

        Set<String> uniqueIPs = new HashSet<>(ips);

        System.out.println("Unique IPs: " + uniqueIPs);
    }
}