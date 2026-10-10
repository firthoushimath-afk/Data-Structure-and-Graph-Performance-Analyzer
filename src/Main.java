import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayManager array = new ArrayManager(100);

        int choice;

        do {

            System.out.println("\n=====================================");
            System.out.println(" DATA STRUCTURE PERFORMANCE ANALYZER ");
            System.out.println("=====================================");
            System.out.println("1. Insert into Array");
            System.out.println("2. Delete from Array");
            System.out.println("3. Search using Linear Search");
            System.out.println("4. Search using Binary Search");
            System.out.println("5. Performance Comparison");
            System.out.println("6. Display Array");
            System.out.println("7. Exit");
            System.out.println("=====================================");
            System.out.print("Enter Choice : ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Value : ");
                    int value = input.nextInt();

                    if (array.insert(value)) {
                        System.out.println("Value Added Successfully!");
                    }

                    break;

                case 2:

                    System.out.print("Enter Value To Delete : ");
                    int deleteValue = input.nextInt();

                    if (array.delete(deleteValue)) {
                        System.out.println("Value Deleted Successfully!");
                    } else {
                        System.out.println("Value Not Found!");
                    }

                    break;

                case 3:

                    System.out.print("Enter Value To Search : ");
                    int linearTarget = input.nextInt();

                    int linearResult =
                            LinearSearch.search(
                                    array.getData(),
                                    array.getSize(),
                                    linearTarget);

                    if (linearResult != -1) {
                        System.out.println(
                                "Value Found At Index: " + linearResult);
                    } else {
                        System.out.println("Value Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter Value To Search : ");
                    int binaryTarget = input.nextInt();

                    int binaryResult =
                            BinarySearch.search(
                                    array.getData(),
                                    array.getSize(),
                                    binaryTarget);

                    if (binaryResult != -1) {
                        System.out.println(
                                "Value Found At Index: " + binaryResult);
                    } else {
                        System.out.println("Value Not Found!");
                    }

                    break;

                case 5:

                    System.out.println(
                            "\n========== PERFORMANCE COMPARISON ==========");

                    System.out.println(
                            "Linear Search Steps : " + LinearSearch.steps);

                    System.out.println(
                            "Binary Search Steps : " + BinarySearch.steps);

                    break;

                case 6:

                    array.display();

                    break;

                case 7:

                    System.out.println("Exiting Program...");

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        input.close();
    }
}