# Data Structure and Graph Performance Analyzer

## Project Description

The Data Structure and Graph Performance Analyzer is a Java console-based application developed for the CIT300 Data Structures and Algorithms module.

The system demonstrates the practical implementation of Arrays, Stacks, Queues, Linked Lists, Searching Algorithms, Graphs, Breadth First Search, and Depth First Search.

The application also compares Linear Search and Binary Search using the number of steps and execution time. All modules are integrated into a single menu-driven Java application.

---

## Objectives

- Implement fundamental data structures using Java.
- Perform insertion, deletion, searching, and display operations.
- Demonstrate Stack operations using the Last In, First Out principle.
- Demonstrate Queue operations using the First In, First Out principle.
- Implement Linear Search and Binary Search.
- Compare searching algorithms using step counts and execution time.
- Represent a Graph using an adjacency list.
- Traverse a Graph using BFS and DFS.
- Integrate all modules into a single Java console application.
- Use GitHub for team collaboration and version control.

---

## Data Structures and Algorithms Used

- Array
- Stack
- Queue
- Singly Linked List
- Linear Search
- Binary Search
- Graph using an Adjacency List
- Breadth First Search
- Depth First Search

---

## Technologies Used

- Java
- Visual Studio Code
- Git
- GitHub

---

## Main System Menu

```text
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
```

---

## System Features

### Array Operations

- Insert Value
- Delete Value
- Search Value
- Display Array
- Array Capacity Validation
- Value Not Found Validation

### Stack Operations

- Push
- Pop
- Peek
- Display Stack
- Stack Overflow Validation
- Empty Stack Validation

The Stack follows the Last In, First Out principle.

### Queue Operations

- Enqueue
- Dequeue
- Peek or Front
- Display Queue
- Queue Overflow Validation
- Empty Queue Validation

The Queue follows the First In, First Out principle.

### Linked List Operations

- Insert Value
- Delete Value
- Search Value
- Display Linked List
- Empty Linked List Validation
- Value Not Found Validation

### Searching Operations

- Linear Search
- Binary Search
- Display Search Results
- Search Step Counting
- Execution Time Measurement

Binary Search is performed using a sorted copy of the Array. Therefore, the original Array order is not modified.

### Graph Operations

- Add Vertex
- Add Edge
- Display Graph
- BFS Traversal
- DFS Traversal
- Duplicate Vertex Validation
- Invalid Vertex Validation
- Empty Graph Validation

The Graph is represented using an adjacency list.

### Performance Comparison

The system compares Linear Search and Binary Search using:

- Search Result
- Number of Steps
- Execution Time in Nanoseconds
- Performance Observation

### Display All Results

This option displays the current results of:

- Array
- Stack
- Queue
- Linked List
- Graph
- Searching Operations
- Performance Comparison

---

## Group Members and Contributions

| Name | Student ID | Responsibility | Individual Contribution |
|------|------------|----------------|-------------------------|
| M.F.A. Himath (Team Leader) | 23DA2-0895 | Array, Searching, Performance Comparison and Integration | Implemented Array operations, Linear Search, Binary Search, search step counting, execution-time measurement, performance comparison, final system integration, input handling, testing, debugging, GitHub management and documentation. |
| M.U.M. Usama Lathin | 23DA2-0838 | Stack and Queue | Implemented Stack Push, Pop, Peek and Display operations. Implemented Queue Enqueue, Dequeue, Peek and Display operations with overflow and empty-structure validations. |
| A.M. Arfan | 23DA2-0930 | Linked List | Implemented Linked List insertion, deletion, searching and display operations with empty-list and value-not-found validations. |
| M.I.M. Amhar | 23DA2-0515 | Graph, BFS and DFS | Implemented the Graph using an adjacency list, Add Vertex, Add Edge, Display Graph, BFS traversal, DFS traversal and Graph-related validations. |

---

## Project Structure

```text
Data-Structure-and-Graph-Performance-Analyzer/
├── README.md
└── src/
    ├── Main.java
    ├── ArrayManager.java
    ├── StackManager.java
    ├── QueueManager.java
    ├── Node.java
    ├── LinkedListManager.java
    ├── LinearSearch.java
    ├── BinarySearch.java
    └── GraphManager.java
```

---

## File Descriptions

### Main.java

Contains the main menu, submenus, input validation, module integration, performance comparison, and result display.

### ArrayManager.java

Implements Array insertion, deletion, searching, display, capacity validation, and size tracking.

### StackManager.java

Implements Stack Push, Pop, Peek, and Display operations.

### QueueManager.java

Implements Queue Enqueue, Dequeue, Peek, and Display operations.

### Node.java

Represents a node in the Singly Linked List.

### LinkedListManager.java

Implements Linked List insertion, deletion, searching, and display operations.

### LinearSearch.java

Implements the Linear Search algorithm and records the number of search steps.

### BinarySearch.java

Implements the Binary Search algorithm and records the number of search steps.

### GraphManager.java

Implements the Graph using an adjacency list and provides vertex, edge, BFS, and DFS operations.

---

## Searching and Performance Comparison

### Linear Search

Linear Search checks each Array element from the beginning until the target value is found or the Array ends.

```text
Best Case: O(1)
Average Case: O(n)
Worst Case: O(n)
```

### Binary Search

Binary Search repeatedly divides the search range into two halves.

Binary Search requires sorted data. The application creates a sorted copy of the Array before performing Binary Search.

```text
Best Case: O(1)
Average Case: O(log n)
Worst Case: O(log n)
```

Execution time may vary depending on the input size, Java Virtual Machine activity, and computer performance. The number of steps provides a clearer demonstration of the performance difference between the two searching algorithms.

---

## Graph Representation and Traversal

The Graph is represented using an adjacency list.

Example:

```text
A -> [B, C]
B -> [A, C]
C -> [A, B]
D -> []
```

In this example:

- `A`, `B`, `C`, and `D` are vertices.
- Connections between the vertices are edges.
- `D` is a disconnected vertex.

### Breadth First Search

BFS visits connected vertices level by level using a Queue.

```text
Start Vertex: A
BFS Traversal: A B C
```

### Depth First Search

DFS explores one path as deeply as possible before returning to visit other paths.

DFS is implemented using recursion and a visited Set.

```text
Start Vertex: A
DFS Traversal: A B C
```

A disconnected vertex does not appear in the traversal unless the traversal starts from that vertex or an edge connects it to the starting component.

---

## Input Validation and Error Handling

The system handles:

- Invalid Main Menu choices
- Invalid Submenu choices
- Non-integer input
- Full Array
- Value Not Found
- Stack Overflow
- Empty Stack
- Queue Overflow
- Empty Queue
- Empty Linked List
- Duplicate Graph Vertex
- Invalid Graph Vertex
- Empty Graph
- Search Operations Before Adding Array Values
- Displaying Search Results Before Performing a Search

---

## How to Compile and Run

1. Open the project folder using Visual Studio Code.

2. Open a terminal and navigate to the `src` folder:

```bash
cd src
```

3. Compile all Java files:

```bash
javac *.java
```

4. Run the integrated application:

```bash
java Main
```

5. Select an option from the Main Menu and follow the instructions displayed in the console.

---

## GitHub Collaboration

GitHub was used for team collaboration and version control.

The following branches were used:

```text
main
array-performance
stack-queue
linkedlist-searching
graph-traversal
```

The collaboration process included:

- Separate development branches
- Meaningful commits
- Push operations
- Pull Requests
- Code reviews
- Conflict resolution
- Merging modules into the Main Branch
- Final system integration

---

## GitHub Repository

The complete source code, commits, branches, and Pull Request history are available at:

```text
https://github.com/firthoushimath-afk/Data-Structure-and-Graph-Performance-Analyzer
```

---

## Conclusion

The Data Structure and Graph Performance Analyzer successfully demonstrates the practical implementation of important data structures and algorithms using Java.

The project includes Array, Stack, Queue, Linked List, Linear Search, Binary Search, Graph, BFS, and DFS operations. It also compares Linear Search and Binary Search using step counts and execution time.

All modules were developed, reviewed, and integrated into a single menu-driven Java console application. GitHub branches, commits, Pull Requests, conflict resolution, and merging were used to support team collaboration.

The completed system demonstrates data structure operations, searching algorithms, performance comparison, graph traversal, input validation, and error handling.