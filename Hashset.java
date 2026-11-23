
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(40);

        // Display elements
        System.out.println(set);

        // Searching an element
        System.out.println(set.contains(20));

        // Removing an element
        set.remove(30);

        // Display after deletion
        System.out.println(set);

        // Size of HashSet
        System.out.println(set.size());
    }
}
