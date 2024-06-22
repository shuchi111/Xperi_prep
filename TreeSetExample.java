
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        // Add elements to the TreeSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Alice"); // Duplicates are not allowed
        // Print the sorted elements
        System.out.println("Elements in the TreeSet:");
        for (String name : names) {
            System.out.println(name);
        }
        // Get the first and last elements
        System.out.println("\nFirst element: " + names.first());
        System.out.println("Last element: " + names.last());
        // Check if an element exists
        System.out.println("\nDoes 'Charlie' exist? " + names.contains("Charlie"));
        // Navigating the TreeSet
        System.out.println("\nElements greater than 'Bob':");
        for (String name : names.tailSet("Bob")) {
            System.out.println(name);
        }
        // Remove elements
        names.remove("Alice");
        System.out.println("\nElements after removing 'Alice':");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
