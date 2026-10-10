import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    private static final ArrayManager array = new ArrayManager(100);
    private static final StackManager stack = new StackManager(100);
    private static final QueueManager queue = new QueueManager(100);
    private static final LinkedListManager linkedList = new LinkedListManager();
    private static final GraphManager graph = new GraphManager();

    private static int lastLinearResult = -1;
    private static int lastBinaryResult = -1;
    private static int lastLinearSteps = 0;
    private static int lastBinarySteps = 0;
    private static long lastLinearTime = 0;
    private static long lastBinaryTime = 0;
    private static int lastSearchTarget = 0;
    private static boolean searchPerformed = false;

    public static void main(String[] args) {

        int choice;

        do {
            displayMainMenu();
            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    arrayOperations();
                    break;

                case 2:
                    stackOperations();
                    break;

                case 3:
                    queueOperations();
                    break;

                case 4:
                    linkedListOperations();
                    break;

                case 5:
                    searchingOperations();
                    break;

                case 6:
                    graphOperations();
                    break;

                case 7:
                    performanceComparison();
                    break;

                case 8:
                    displayAllResults();
                    break;

                case 9:
                    System.out.println("\nExiting the program...");
                    System.out.println("Thank you for using the analyzer.");
                    break;

                default:
                    System.out.println("\nError: Invalid main menu choice.");
                    System.out.println("Please enter a number from 1 to 9.");
            }

        } while (choice != 9);

        input.close();
    }

    private static void displayMainMenu() {

        System.out.println("\n==================================================");
        System.out.println("       DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("==================================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
        System.out.println("==================================================");
    }

    private static void arrayOperations() {

        int choice;

        do {
            System.out.println("\n=====================================");
            System.out.println("          ARRAY OPERATIONS");
            System.out.println("=====================================");
            System.out.println("1. Insert Value");
            System.out.println("2. Delete Value");
            System.out.println("3. Search Value");
            System.out.println("4. Display Array");
            System.out.println("5. Back to Main Menu");
            System.out.println("=====================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    int insertValue = readInteger("Enter value to insert: ");

                    if (array.insert(insertValue)) {
                        System.out.println("Value inserted successfully.");
                    }
                    break;

                case 2:
                    int deleteValue = readInteger("Enter value to delete: ");

                    if (array.delete(deleteValue)) {
                        System.out.println("Value deleted successfully.");
                    } else {
                        System.out.println("Error: Value not found.");
                    }
                    break;

                case 3:
                    int searchValue = readInteger("Enter value to search: ");
                    int result = array.search(searchValue);

                    if (result != -1) {
                        System.out.println(
                                "Value found at array index: " + result);
                    } else {
                        System.out.println("Error: Value not found.");
                    }
                    break;

                case 4:
                    array.display();
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println(
                            "Error: Enter a number from 1 to 5.");
            }

        } while (choice != 5);
    }

    private static void stackOperations() {

        int choice;

        do {
            System.out.println("\n=====================================");
            System.out.println("          STACK OPERATIONS");
            System.out.println("=====================================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Back to Main Menu");
            System.out.println("=====================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    int value = readInteger("Enter value to push: ");
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println(
                            "Error: Enter a number from 1 to 5.");
            }

        } while (choice != 5);
    }

    private static void queueOperations() {

        int choice;

        do {
            System.out.println("\n=====================================");
            System.out.println("          QUEUE OPERATIONS");
            System.out.println("=====================================");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display Queue");
            System.out.println("5. Back to Main Menu");
            System.out.println("=====================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    int value = readInteger("Enter value to enqueue: ");
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println(
                            "Error: Enter a number from 1 to 5.");
            }

        } while (choice != 5);
    }

    private static void linkedListOperations() {

        int choice;

        do {
            System.out.println("\n=====================================");
            System.out.println("       LINKED LIST OPERATIONS");
            System.out.println("=====================================");
            System.out.println("1. Insert Value");
            System.out.println("2. Delete Value");
            System.out.println("3. Search Value");
            System.out.println("4. Display Linked List");
            System.out.println("5. Back to Main Menu");
            System.out.println("=====================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    int insertValue =
                            readInteger("Enter value to insert: ");

                    linkedList.insert(insertValue);

                    System.out.println(
                            "Value inserted successfully.");
                    break;

                case 2:
                    int deleteValue =
                            readInteger("Enter value to delete: ");

                    if (linkedList.delete(deleteValue)) {
                        System.out.println(
                                "Value deleted successfully.");
                    } else {
                        System.out.println(
                                "Error: Value not found.");
                    }
                    break;

                case 3:
                    int searchValue =
                            readInteger("Enter value to search: ");

                    if (linkedList.search(searchValue)) {
                        System.out.println("Value found.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 4:
                    linkedList.display();
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println(
                            "Error: Enter a number from 1 to 5.");
            }

        } while (choice != 5);
    }

    private static void searchingOperations() {

        int choice;

        do {
            System.out.println("\n=====================================");
            System.out.println("        SEARCHING OPERATIONS");
            System.out.println("=====================================");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Display Search Results");
            System.out.println("4. Back to Main Menu");
            System.out.println("=====================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    performLinearSearch();
                    break;

                case 2:
                    performBinarySearch();
                    break;

                case 3:
                    displaySearchResults();
                    break;

                case 4:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println(
                            "Error: Enter a number from 1 to 4.");
            }

        } while (choice != 4);
    }

    private static void performLinearSearch() {

        if (array.getSize() == 0) {
            System.out.println(
                    "Error: Add values to the array before searching.");
            return;
        }

        lastSearchTarget =
                readInteger("Enter value for Linear Search: ");

        long startTime = System.nanoTime();

        lastLinearResult = LinearSearch.search(
                array.getData(),
                array.getSize(),
                lastSearchTarget);

        long endTime = System.nanoTime();

        lastLinearTime = endTime - startTime;
        lastLinearSteps = LinearSearch.steps;
        searchPerformed = true;

        if (lastLinearResult != -1) {
            System.out.println(
                    "Value found at index: " + lastLinearResult);
        } else {
            System.out.println("Value not found.");
        }

        System.out.println(
                "Linear Search Steps: " + lastLinearSteps);

        System.out.println(
                "Linear Search Time: "
                        + lastLinearTime
                        + " nanoseconds");
    }

    private static void performBinarySearch() {

        if (array.getSize() == 0) {
            System.out.println(
                    "Error: Add values to the array before searching.");
            return;
        }

        lastSearchTarget =
                readInteger("Enter value for Binary Search: ");

        int[] sortedArray = Arrays.copyOf(
                array.getData(),
                array.getSize());

        Arrays.sort(sortedArray);

        System.out.println("Sorted Array Used for Binary Search:");

        displayTemporaryArray(
                sortedArray,
                sortedArray.length);

        long startTime = System.nanoTime();

        lastBinaryResult = BinarySearch.search(
                sortedArray,
                sortedArray.length,
                lastSearchTarget);

        long endTime = System.nanoTime();

        lastBinaryTime = endTime - startTime;
        lastBinarySteps = BinarySearch.steps;
        searchPerformed = true;

        if (lastBinaryResult != -1) {
            System.out.println(
                    "Value found at sorted array index: "
                            + lastBinaryResult);
        } else {
            System.out.println("Value not found.");
        }

        System.out.println(
                "Binary Search Steps: " + lastBinarySteps);

        System.out.println(
                "Binary Search Time: "
                        + lastBinaryTime
                        + " nanoseconds");
    }

    private static void graphOperations() {

        int choice;

        do {
            System.out.println("\n=====================================");
            System.out.println("          GRAPH OPERATIONS");
            System.out.println("=====================================");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Back to Main Menu");
            System.out.println("=====================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    String vertex =
                            readText("Enter vertex name: ");

                    graph.addVertex(vertex);
                    break;

                case 2:
                    String source =
                            readText("Enter source vertex: ");

                    String destination =
                            readText("Enter destination vertex: ");

                    graph.addEdge(source, destination);
                    break;

                case 3:
                    graph.displayGraph();
                    break;

                case 4:
                    String bfsStart =
                            readText("Enter BFS start vertex: ");

                    graph.bfs(bfsStart);
                    break;

                case 5:
                    String dfsStart =
                            readText("Enter DFS start vertex: ");

                    graph.dfs(dfsStart);
                    break;

                case 6:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println(
                            "Error: Enter a number from 1 to 6.");
            }

        } while (choice != 6);
    }

    private static void performanceComparison() {

        if (array.getSize() == 0) {
            System.out.println(
                    "\nError: Add values to the array first.");
            return;
        }

        int target =
                readInteger(
                        "Enter one target value for comparison: ");

        int[] sortedArray = Arrays.copyOf(
                array.getData(),
                array.getSize());

        Arrays.sort(sortedArray);

        long linearStart = System.nanoTime();

        lastLinearResult = LinearSearch.search(
                array.getData(),
                array.getSize(),
                target);

        long linearEnd = System.nanoTime();

        lastLinearTime = linearEnd - linearStart;
        lastLinearSteps = LinearSearch.steps;

        long binaryStart = System.nanoTime();

        lastBinaryResult = BinarySearch.search(
                sortedArray,
                sortedArray.length,
                target);

        long binaryEnd = System.nanoTime();

        lastBinaryTime = binaryEnd - binaryStart;
        lastBinarySteps = BinarySearch.steps;

        lastSearchTarget = target;
        searchPerformed = true;

        System.out.println(
                "\n===============================================");
        System.out.println(
                "          PERFORMANCE COMPARISON");
        System.out.println(
                "===============================================");

        System.out.println("Target Value          : " + target);

        System.out.println(
                "Linear Search Result  : "
                        + getSearchResultText(lastLinearResult));

        System.out.println(
                "Linear Search Steps   : "
                        + lastLinearSteps);

        System.out.println(
                "Linear Search Time    : "
                        + lastLinearTime
                        + " nanoseconds");

        System.out.println("-----------------------------------------------");

        System.out.println(
                "Binary Search Result  : "
                        + getSearchResultText(lastBinaryResult));

        System.out.println(
                "Binary Search Steps   : "
                        + lastBinarySteps);

        System.out.println(
                "Binary Search Time    : "
                        + lastBinaryTime
                        + " nanoseconds");

        System.out.println(
                "===============================================");

        System.out.println(
                "Note: Binary Search uses a sorted copy of the array.");

        System.out.println(
                "The sorting time is not included in Binary Search time.");

        if (lastBinarySteps < lastLinearSteps) {
            System.out.println(
                    "Observation: Binary Search used fewer steps.");
        } else if (lastLinearSteps < lastBinarySteps) {
            System.out.println(
                    "Observation: Linear Search used fewer steps "
                            + "for this target.");
        } else {
            System.out.println(
                    "Observation: Both searches used the same steps.");
        }
    }

    private static void displayAllResults() {

        System.out.println(
                "\n==================================================");
        System.out.println(
                "              DISPLAY ALL RESULTS");
        System.out.println(
                "==================================================");

        System.out.println("\n1. ARRAY RESULTS");
        array.display();

        System.out.println("\n2. STACK RESULTS");
        stack.display();

        System.out.println("\n3. QUEUE RESULTS");
        queue.display();

        System.out.println("\n4. LINKED LIST RESULTS");
        linkedList.display();

        System.out.println("\n5. GRAPH RESULTS");
        graph.displayGraph();

        System.out.println("\n6. SEARCH AND PERFORMANCE RESULTS");
        displaySearchResults();

        System.out.println(
                "==================================================");
    }

    private static void displaySearchResults() {

        if (!searchPerformed) {
            System.out.println(
                    "No searching or performance comparison "
                            + "has been performed yet.");
            return;
        }

        System.out.println(
                "\n========== LAST SEARCH RESULTS ==========");

        System.out.println(
                "Target Value         : " + lastSearchTarget);

        System.out.println(
                "Linear Search Result : "
                        + getSearchResultText(lastLinearResult));

        System.out.println(
                "Linear Search Steps  : "
                        + lastLinearSteps);

        System.out.println(
                "Linear Search Time   : "
                        + lastLinearTime
                        + " nanoseconds");

        System.out.println(
                "Binary Search Result : "
                        + getSearchResultText(lastBinaryResult));

        System.out.println(
                "Binary Search Steps  : "
                        + lastBinarySteps);

        System.out.println(
                "Binary Search Time   : "
                        + lastBinaryTime
                        + " nanoseconds");
    }

    private static String getSearchResultText(int result) {

        if (result == -1) {
            return "Value Not Found";
        }

        return "Value Found at Index " + result;
    }

    private static void displayTemporaryArray(
            int[] values,
            int size) {

        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + " ");
        }

        System.out.println();
    }

    private static int readInteger(String message) {

        while (true) {

            System.out.print(message);

            if (input.hasNextInt()) {
                int value = input.nextInt();
                input.nextLine();
                return value;
            }

            System.out.println(
                    "Error: Please enter a valid integer.");

            input.nextLine();
        }
    }

    private static String readText(String message) {

        while (true) {

            System.out.print(message);

            String value = input.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println(
                    "Error: Input cannot be empty.");
        }
    }
}