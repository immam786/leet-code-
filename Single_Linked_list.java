public class Single_Linked_list {
    class node {
            int data;
            node next;
            node(int data){
            this.data = data;
            this.next=null;
        }
    }
        public static void main(String[] args) {
            Single_Linked_list list = new Single_Linked_list();
            node head = list.new node(10);
            head.next = list.new node(20);
            head.next.next = list.new node(10);
            head.next.next.next = list.new node(20);
            node cur = head;
            while (cur != null) {
                System.out.println(cur.data);
                cur = cur.next;
            }
        }
}
