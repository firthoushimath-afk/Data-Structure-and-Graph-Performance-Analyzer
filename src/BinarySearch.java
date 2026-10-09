public class BinarySearch {

    public static int steps = 0;

    public static int search(int[] array, int size, int target) {

        steps = 0;

        int left = 0;
        int right = size - 1;

        while (left <= right) {

            steps++;

            int mid = (left + right) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}