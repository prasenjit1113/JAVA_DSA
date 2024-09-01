package New;
import java.util.*;
public class Queue {
	private int front,rear;
	private int maxSize;
	private int[] arr;
	
	public Queue(int max) {
		maxSize=max;
		arr=new int[maxSize];
		front=-1;
		rear=-1;
	}
	public void enqueue() {
		if(rear==maxSize-1) {
			System.out.println("queue is full...");
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the data: ");
			int data=sc.nextInt();
			rear++;
			arr[rear]=data;
			if(rear==0) {
				front=0;
			}
		}
	}
	public void dequeue() {
		if(rear==-1&&front==-1) {
			System.out.println("queue is empty...");
		}
		else {
			int x=arr[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else {
				front++;
			}
			System.out.println("deleted data is: "+x);
		}
	}
	public void display() {
		if(rear==-1&&front==-1) {
			System.out.println("queue is empty...");
		}
		else {
			System.out.println("queue elements are: ");
			for(int i=front;i<=rear;i++) {
				System.out.print("| "+arr[i]+" |");
			}
			System.out.println();
		}
	}
	public void displayFrontRear() {
		if(rear==-1&&front==-1) {
			System.out.println("queue is empty");
		}
		else {
			System.out.print("front element is: "+arr[front]);
			System.out.println();
			System.out.print("rear element is: "+arr[rear]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the max size of queue: ");
		int max=sc.nextInt();
		Queue q=new Queue(max);
		while(true) {
			System.out.println("Choose option:");
			System.out.println("1.enqueue\t2.dequeue\t3.Display\t4.DisplayFrontRear\t5.Exit");
			System.out.print("enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:q.enqueue();
						break;
				case 2:q.dequeue();
						break;
				case 3:q.display();
						break;
				case 4:q.displayFrontRear();
						break;
				case 5:System.out.println("operation exited...");
						System.exit(0);
				default:System.out.println("wrong choice...try again");
			}
		}

	}

}
