
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        // Display elements
        System.out.println(set);

        // Remove element
        set.remove(30);
        System.out.println(set);

        // Search element
        System.out.println(set.contains(40));

        // First and last elements
        System.out.println(set.first());
        System.out.println(set.last());

        // Size
        System.out.println(set.size());
    }
}
