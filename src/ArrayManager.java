public class ArrayManager {

    private int[] data;
    private int size;

    public ArrayManager(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // Insert element
    public boolean insert(int value) {

        if (size == data.length) {
            System.out.println("Array is full.");
            return false;
        }

        data[size] = value;
        size++;

        return true;
    }

    // Delete element
    public boolean delete(int value) {

        int index = -1;

        for (int i = 0; i < size; i++) {

            if (data[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;

        return true;
    }

    // Search element
    public int search(int value) {

        for (int i = 0; i < size; i++) {

            if (data[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Display array
    public void display() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("\nArray Elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }

    // Get current size
    public int getSize() {
        return size;
    }

    // Get array data
    public int[] getData() {
        return data;
    }
}
