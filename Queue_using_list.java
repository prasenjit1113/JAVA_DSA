package New;
import java.util.*;

class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue_using_list {
    private QueueNode front = null;
    private QueueNode rear = null;
    private int maxSize;
    private int size = 0;

    public Queue_using_list(int maxSize) {
        this.maxSize = maxSize;
    }

    // Method to enqueue data into the queue
    public void enqueue() {
        if (size == maxSize) {
            System.out.println("Queue is full...");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
            QueueNode newNode = new QueueNode(data);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }
    }

    // Method to dequeue data from the queue
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty...");
        } else {
            System.out.println("Deleted data is: " + front.data);
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    // Method to display the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty...");
        } else {
            System.out.println("Queue elements are: ");
            QueueNode temp = front;
            while (temp != null) {
                System.out.print("| " + temp.data + " | ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Method to display the front and rear elements of the queue
    public void displayFrontRear() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + front.data);
            System.out.println("Rear element is: " + rear.data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max size of queue: ");
        int max = sc.nextInt();
        Queue_using_list queue = new Queue_using_list(max);
        while (true) {
            System.out.println("Choose option:");
            System.out.println("1.Enqueue\t2.Dequeue\t3.Display\t4.DisplayFrontRear\t5.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    queue.enqueue();
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    queue.displayFrontRear();
                    break;
                case 5:
                    System.out.println("Operation exited...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice...try again");
            }
        }
    }
}

