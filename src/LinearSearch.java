public class LinearSearch {

    public static int steps = 0;

    public static int search(int[] array, int size, int target) {

        steps = 0;

        for (int i = 0; i < size; i++) {

            steps++;

            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}