package New;

import java.util.Scanner;

public class Stack {
	private int top;
	private int arr[];
	private int maxSize;
	
	//constructor to initialize the size and array and top
	public Stack(int size) {
		maxSize=size;
		arr=new int[maxSize];
		top=-1;
	}
	
	public void push() {
		Scanner sc=new Scanner(System.in);
		if(top==maxSize-1) {
			System.out.println("stack is full...");
		}
		else {
			top++;
			System.out.print("enter the data: ");
			int data=sc.nextInt();
			arr[top]=data;  //stored data pushed into array/stack
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack is empty...");
		}
		else {
			int data=arr[top];   //top element is to popped
			top--;
			System.out.println("deleted data is: "+data);
		}
	}
	public void display() {
		if(top==-1) {
			System.out.println("stack is empty...");
		}
		System.out.println("stack elements are: ");
		for(int i=top;i>=0;i--) {    //to display more efficiently (top to bottom like stack)
			System.out.println("| "+arr[i]+" |");
		}
	}
	public void displayTop() {
		if(top==-1) {
			System.out.println("stack is empty...");
		}
		else {
			System.out.println("top element is :"+arr[top]);
		}
	}
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the maxSize of stack: ");
		int max=sc.nextInt();
		Stack stack=new Stack(max);
		while(true) {
			System.out.println("Choose option:");
			System.out.println("1.Push\t2.Pop\t3.Display\t4.Display_Top\t5.Exit");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1: stack.push();
				        break;
				case 2: stack.pop();
		        		break;
				case 3: stack.display();
		        		break;
				case 4: stack.displayTop();
		        		break;
				case 5: System.out.println("successfully exited...");
						System.exit(0);
		        default: System.out.println("wrong choice..try again..");
			}
		}
		
	}

}
