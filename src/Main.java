import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedListManager list = new LinkedListManager();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" LINKED LIST MODULE ");
            System.out.println("==============================");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("==============================");
            System.out.print("Enter Choice : ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Value : ");

                    int insertValue = input.nextInt();

                    list.insert(insertValue);

                    System.out.println("Value Inserted Successfully!");

                    break;

                case 2:

                    System.out.print("Enter Value To Search : ");

                    int searchValue = input.nextInt();

                    if (list.search(searchValue)) {

                        System.out.println("Value Found!");

                    } else {

                        System.out.println("Value Not Found!");
                    }

                    break;

                case 3:

                    System.out.print("Enter Value To Delete : ");

                    int deleteValue = input.nextInt();

                    if (list.delete(deleteValue)) {

                        System.out.println("Value Deleted Successfully!");

                    } else {

                        System.out.println("Value Not Found!");
                    }

                    break;

                case 4:

                    list.display();

                    break;

                case 5:

                    System.out.println("Exiting Program...");

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        input.close();
    }
}