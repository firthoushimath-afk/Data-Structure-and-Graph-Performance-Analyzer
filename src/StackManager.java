public class StackManager {

    private int[] stack;
    private int top;

    public StackManager(int size) {
        stack = new int[size];
        top = -1;
    }

    // Push
    public void push(int value) {

        if (top == stack.length - 1) {

            System.out.println("Stack Overflow");

            return;
        }

        stack[++top] = value;

        System.out.println("Value Pushed Successfully!");
    }

    // Pop
    public void pop() {

        if (top == -1) {

            System.out.println("Stack is Empty");

            return;
        }

        System.out.println(
                "Removed: " + stack[top]);

        top--;
    }

    // Peek
    public void peek() {

        if (top == -1) {

            System.out.println("Stack is Empty");

            return;
        }

        System.out.println(
                "Top Element: " + stack[top]);
    }

    // Display
    public void display() {

        if (top == -1) {

            System.out.println("Stack is Empty");

            return;
        }

        System.out.println("\nStack Elements:");

        for (int i = top; i >= 0; i--) {

            System.out.println(stack[i]);
        }
    }
}