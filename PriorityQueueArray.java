
public class PriorityQueueArray {
    int[] queue = new int[10];
    int size = 0;

    // Insert element
    void insert(int value) {
        if (size == queue.length) {
            System.out.println("Queue is Full");
            return;
        }

        queue[size++] = value;
        System.out.println(value + " inserted");
    }

    // Delete element with highest priority
    void delete() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        int minIndex = 0;

        for (int i = 1; i < size; i++) {
            if (queue[i] < queue[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("Deleted: " + queue[minIndex]);

        for (int i = minIndex; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }

        size--;
    }

    // Display queue
    void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueArray pq = new PriorityQueueArray();

        pq.insert(30);
        pq.insert(10);
        pq.insert(20);
        pq.insert(5);

        pq.display();

        pq.delete();
        pq.display();
    }
}
