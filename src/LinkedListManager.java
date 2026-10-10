public class LinkedListManager {

    private Node head;

    public LinkedListManager() {
        head = null;
    }

    // Insert
    public void insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Search
    public boolean search(int value) {

        Node current = head;

        while (current != null) {

            if (current.data == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Delete
    public boolean delete(int value) {

        if (head == null) {
            return false;
        }

        if (head.data == value) {
            head = head.next;
            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == value) {

                current.next = current.next.next;

                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Display
    public void display() {

        if (head == null) {

            System.out.println("Linked List is Empty.");

            return;
        }

        Node current = head;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}