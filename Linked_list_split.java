package New;
//This program is a 3 in 1 program. It covers i)split on even odd values ii)split on even odd index iii)split on positive negative numbers

import java.util.*;
class Node_split{
	int data;
	Node_split next;
	Node_split(int data){
		this.data=data;
		this.next=null;
	}
}
public class Linked_list_split {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Node_split head=null;   //for original list
		Node_split head1=null;  //for odd list
		Node_split head2=null;  //for even list
		System.out.print("enter the number of data: ");
		int n=sc.nextInt();
		
		// Create the original list
		for(int i=0;i<n;i++) {
			System.out.print("enter the data: ");
			int x=sc.nextInt();
			Node_split newNode=new Node_split(x);  //inserting new node
			if(head==null) {
				head=newNode;
				head.next=null;
			}
			else {
				Node_split temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}
		
		 // Split the list into two, based on values
		Node_split r;
		for(r=head;r!=null;r=r.next) {    //for(r=head,i=1;r!=null;r=r.next,i++) -->it will work for even, odd position
			Node_split newNode=new Node_split(r.data);
			//for even values
			if(r.data%2==0) {        //r.data>0 -->it will work for positive,negative values //i%2==0 -->it will work for even, odd position
				if(head2==null) {
					head2=newNode;
				}
				else {
					Node_split temp=head2;
					while(temp.next!=null) {
						temp=temp.next;
					}
					temp.next=newNode;
				}
			}
			//for odd values
			else {
				if(head1==null) {
					head1=newNode;
				}
				else {
					Node_split temp=head1;
					while(temp.next!=null) {
						temp=temp.next;
					}
					temp.next=newNode;
				}
			}
		}
		System.out.println("the original list is: ");
		displayList(head);
		System.out.println("the even element list is: ");
		displayList(head2);
		System.out.println("the odd element list is: ");
		displayList(head1);	
		sc.close();
	}
	public static void displayList(Node_split headdu) {
		Node_split temp;
		for(temp=headdu;temp!=null;temp=temp.next) {
			System.out.print("|"+temp.data+"|-->");
		}
		System.out.println("NULL");
	}
}
