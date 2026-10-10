public class QueueManager {

    private int[] queue;
    private int front;
    private int rear;

    public QueueManager(int size) {

        queue = new int[size];

        front = 0;
        rear = -1;
    }

    // Enqueue
    public void enqueue(int value) {

        if (rear == queue.length - 1) {

            System.out.println("Queue Overflow");

            return;
        }

        queue[++rear] = value;

        System.out.println("Value Added Successfully!");
    }

    // Dequeue
    public void dequeue() {

        if (front > rear) {

            System.out.println("Queue is Empty");

            return;
        }

        System.out.println(
                "Removed: " + queue[front]);

        front++;
    }

    // Peek
    public void peek() {

        if (front > rear) {

            System.out.println("Queue is Empty");

            return;
        }

        System.out.println(
                "Front Element: " + queue[front]);
    }

    // Display
    public void display() {

        if (front > rear) {

            System.out.println("Queue is Empty");

            return;
        }

        System.out.println("\nQueue Elements:");

        for (int i = front; i <= rear; i++) {

            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}