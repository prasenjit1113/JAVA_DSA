package New;
import java.util.*;

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack_using_list {
    private StackNode head = null;
    private int top = -1;
    private int max;
    private Scanner sc;

    // Constructor to initialize the stack with a maximum size
    public Stack_using_list() {
        sc = new Scanner(System.in);
        System.out.print("Enter the max size of the stack: ");
        this.max = sc.nextInt();
    }

    // Method to push data onto the stack
    public void push() {
        if (top == max - 1) {
            System.out.println("Stack is full...");
        } else {
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
            StackNode newNode = new StackNode(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            top++;
        }
    }

    // Method to pop data from the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty...");
        } else {
            System.out.print("Deleted data is: " + head.data);
            head = head.next;
            top--;
        }
    }

    // Method to display the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty...");
        } else {
            StackNode temp = head;
            System.out.println("Stack is: ");
            while (temp != null) {
                System.out.println("| " + temp.data + " |");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack_using_list stack = new Stack_using_list();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1.Push\t2.Pop\t3.Display\t4.Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice...try again");
            }
        }
    }
}

