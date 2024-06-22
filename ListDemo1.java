
import java.util.HashSet;
import java.util.Set;

public class ListDemo1 {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate element, not added
        numbers.remove(1);
        //a = numbers.add(4);
        System.out.println(numbers);
        System.out.println(numbers.contains(2));
    }
}
