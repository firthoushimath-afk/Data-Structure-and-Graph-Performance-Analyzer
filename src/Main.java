import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GraphManager graph = new GraphManager();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" GRAPH TRAVERSAL MODULE ");
            System.out.println("==============================");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Exit");
            System.out.println("==============================");
            System.out.print("Enter Choice : ");

            choice = input.nextInt();

            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Vertex : ");

                    String vertex =
                            input.nextLine();

                    graph.addVertex(vertex);

                    break;

                case 2:

                    System.out.print("Source Vertex : ");

                    String source =
                            input.nextLine();

                    System.out.print("Destination Vertex : ");

                    String destination =
                            input.nextLine();

                    graph.addEdge(source, destination);

                    break;

                case 3:

                    graph.displayGraph();

                    break;

                case 4:

                    System.out.print(
                            "Enter Start Vertex : ");

                    String bfsStart =
                            input.nextLine();

                    graph.bfs(bfsStart);

                    break;

                case 5:

                    System.out.print(
                            "Enter Start Vertex : ");

                    String dfsStart =
                            input.nextLine();

                    graph.dfs(dfsStart);

                    break;

                case 6:

                    System.out.println(
                            "Exiting Program...");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice!");
            }

        } while (choice != 6);

        input.close();
    }
}