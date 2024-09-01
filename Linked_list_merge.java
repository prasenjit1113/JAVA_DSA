package New;

import java.util.Scanner;

class Node_merge{
	int data;
	Node_merge next;
	Node_merge(int data) {
		this.data=data;
		this.next=null;
	}
}

public class Linked_list_merge {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Node_merge head1=null;   //for list1
		Node_merge head2=null;   //for list2
		Node_merge head3=null;   //for merge list
		
		System.out.print("enter the number of data for list1: ");
		int n=sc.nextInt();
		System.out.println("enter the data of list1 in sorted order:");
		for(int i=0;i<n;i++) {
			System.out.print("enter the data: ");
			int x=sc.nextInt();
			Node_merge newNode=new Node_merge(x);  //inserting new node
			if(head1==null) {
				head1=newNode;
				head1.next=null;
			}
			else {
				Node_merge temp=head1;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}
		
		System.out.print("enter the number of data for list2 in sorted order: ");
		int m=sc.nextInt();
		System.out.println("enter the data of list2:");
		for(int i=0;i<m;i++) {
			System.out.print("enter the data: ");
			int x=sc.nextInt();
			Node_merge newNode=new Node_merge(x);  //inserting new node
			if(head2==null) {
				head2=newNode;
				head2.next=null;
			}
			else {
				Node_merge temp=head2;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}
		
		//to perform merging list
		Node_merge p=head1;
		Node_merge q=head2;
		while(p!=null && q!=null) {
			Node_merge new1=new Node_merge(0);  //new node to insert
			if(p.data<q.data) {
				new1.data=p.data;
				p=p.next;
			}
			else {
				new1.data=q.data;
				q=q.next;
			}
			//inserting
			if(head3==null) {
				head3=new1;
				head3.next=null;
			}
			else {
				Node_merge temp=head3;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=new1;
//				new1.next=null;
			}
		}
		//if q list completed but not p
		while(p!=null) {
			Node_merge new1=new Node_merge(0);
			new1.data=p.data;
			p=p.next;
			Node_merge temp=head3;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new1;
		}
		//if p list completed but not q
		while(q!=null) {
			Node_merge new1=new Node_merge(0);
			new1.data=q.data;
			q=q.next;
			Node_merge temp=head3;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new1;
		}
		//display
		System.out.println("the list 1 is: ");
		displayList(head1);
		System.out.println("the list 2 is: ");
		displayList(head2);
		System.out.println("the merge list is: ");
		displayList(head3);	
		sc.close();
	}
	public static void displayList(Node_merge headdu) {
		Node_merge temp;
		for(temp=headdu;temp!=null;temp=temp.next) {
			System.out.print("|"+temp.data+"|-->");
		}
		System.out.println("NULL");
	}
}
