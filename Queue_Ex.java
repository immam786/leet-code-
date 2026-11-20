import java.io.IOException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queue_Ex {
    public static void main(String[] args){
        Queue<Integer> qu = new LinkedList<>();
        qu.add(90);
        qu.add(39);
        qu.add(49);
        System.out.println(qu.peek());
        System.out.println(qu.isEmpty());
        System.out.println(qu.size());
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
        try {
            qu.remove();
            System.out.println(qu);
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
        System.out.println("Exception Handled!");
    }
}

