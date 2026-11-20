import java.util.*;
public class Stack_Ex {
    public static void main(String[] args){
        Stack <Integer> st=new Stack<>();
        st.push(20);
        st.push(10);
        st.push(69);
        System.out.println("Top of Stack:"+st.peek());
        st.pop();
        System.out.println("Is Stack Empty:"+st.isEmpty());
        st.push(13);
        st.push(23);
        System.out.println("Top of Stack:"+st.peek());
        System.out.println(st);
    }
}
