
import java.util.*;

public class Map {

    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        System.out.println(ages.get("Bob")); // Output: 30
    }
}
