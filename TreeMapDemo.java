
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        // Create a TreeMap with String keys and Integer values
        TreeMap<String, Integer> studentAges = new TreeMap<>();
        // Add key-value pairs to the TreeMap
        studentAges.put("Alice", 25);
        studentAges.put("Bob", 30);
        studentAges.put("Charlie", 22);
        studentAges.put("David", 28);
        // Access elements using get(key) method
        System.out.println("Alice's age: " + studentAges.get("Alice"));
        // Check if a key exists using containsKey(key)
        if (studentAges.containsKey("Charlie")) {
            System.out.println("Charlie is present in the map.");
        }
        // Iterate through all key-value pairs
        for (Map.Entry<String, Integer> entry : studentAges.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // Get the first and last key (sorted order in TreeMap)
        System.out.println("First student (by name): " + studentAges.firstKey());
        System.out.println("Last student (by name): " + studentAges.lastKey());
        // SubMap - get a range of key-value pairs
        SortedMap<String, Integer> twenties = studentAges.subMap("Bob", "David");
        System.out.println("Students in their twenties: " + twenties);
        // Remove a key-value pair
        studentAges.remove("Charlie");
        System.out.println("Map after removing Charlie: " + studentAges);
    }
}
