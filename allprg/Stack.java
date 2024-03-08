package allprg;
public class Stack {
    private int[] elements;
    private int top;
    private static final int MAX_SIZE = 10;
    public Stack() {
        elements = new int[MAX_SIZE];
        top = -1;
    }
    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            elements[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push: " + value);
        }
    }
    public int pop() {
        if (!isEmpty()) {
            int poppedValue = elements[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }
    public int size() {
        return top + 1;
    }
    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    public int search(int value) {
        for (int i = 0; i <= top; i++) {
            if (elements[i] == value) {
                return i + 1; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
        }
        stack.display();
        System.out.println("Number of elements in the stack: " + stack.size());
        int searchValue = 30;
        int position = stack.search(searchValue);
        if (position != -1) {
            System.out.println("Element " + searchValue + " found at position: " + position);
        } else {
            System.out.println("Element " + searchValue + " not found in the stack.");
        }
        for (int i = 1; i <= 3; i++) {
            stack.pop();
        }
        stack.display();
    }
}
