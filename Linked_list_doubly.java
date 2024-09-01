package New;

import java.util.Scanner;
class Node2 {
    int data;   //stores the data (an integer) contained in the node.
    Node2 next;  //reference to the next node in the linked list
    Node2 prev;
    
    Node2(int data) {  //constructor, The purpose of the constructor is to initialize the new object.
        this.data = data;  //The this keyword refers to the current instance of the class
        this.next = null;  //indicating that the node does not yet point to any other node.
        this.prev = null;
    }
}

public class Linked_list_doubly {
	Node2 head = null;  // The list is empty initially

    // Method to insert a new node at the beginning
    public void insertAtBeg(int data) {
    	Node2 newNode=new Node2(data);
    	if(head==null) {
    		head=newNode;
    	}
    	else {
    		newNode.next=head;
    		head.prev=newNode;
    		head=newNode;
    	}
    }
    public void insertAtEnd(int data) {
    	Node2 newNode=new Node2(data);
    	if(head==null) {
    		head=newNode;
    	}
    	else {
    		Node2 temp=head;
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
			temp.next=newNode;
			newNode.prev=temp;
    	}
    }
    public void insertAtAnyPos(int data) {
    	Node2 newNode=new Node2(data);
    	if(head==null) {
    		head=newNode;
    	}
    	else {
    		Scanner sc = new Scanner(System.in);
        	System.out.print("enter the position: ");
        	int pos=sc.nextInt();
    		if(pos==1) {
    			newNode.next=head;
    			head.prev=newNode;
    			head=newNode;
    		}
    		else {
    			int i=1;
    			Node2 temp=head;
    			while(i!=pos-1 && temp.next!=null) {
    				i++;
    				temp=temp.next;
    			}
    			if(i==pos-1 && temp.next!=null) {
    				newNode.next=temp.next;
    				temp.next.prev=newNode;
    				temp.next=newNode;
    				newNode.prev=temp;
    			}
    			else if(i==pos-1 && temp.next==null) {
    				temp.next=newNode;
    				newNode.prev=temp;
    			}
    			else {
    				System.out.println("position not exists...");
    			}
    		}
    	}
    }
    public void insertAfterAnyPos(int data) {
    	Node2 newNode = new Node2(data);
        if (head == null) {  //no node available
            head = newNode;  
        } 
        else {
        	Scanner sc=new Scanner(System.in);
        	System.out.print("enter the position after which you want to insert data: ");
        	int pos=sc.nextInt();	
    	    Node2 temp = head; //initializing in temp and we use temp for any operations as head can not be used to traverse ,it will make problem
    		int i=1;
    		while(i!=pos && temp.next!=null) {  //traversing to fetch the node position
    			i++;
    			temp=temp.next;
    		}
    		if(i==pos && temp.next!=null) {   //multiple nodes available & inserting between any two nodes
    			newNode.next=temp.next;
    			temp.next.prev=newNode;
    			temp.next=newNode;
    			newNode.prev=temp;
    		}
    		else if(i==pos && temp.next==null) {   //multiple nodes available & inserting at the end
    			temp.next=newNode;
    			newNode.prev=temp;
    		}
    		else {
    			System.out.println("position not found...");
    		}
        }
    }
    public void insertAfterAnyValue(int data) {
    	Node2 newNode = new Node2(data);
    	if(head==null) {
    		head=newNode;
    	}
    	else {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("enter the value after which you want to insert : ");
    		int val=sc.nextInt();
    		Node2 temp=head;
    		while(temp.data!=val && temp.next!=null) {  //traversing to fetch the node value
    			temp=temp.next;
    		}
    		if(temp.data==val && temp.next!=null) {   //multiple nodes available & value is between any two nodes
    			newNode.next=temp.next;
    			temp.next.prev=newNode;
    			temp.next=newNode;
    			newNode.prev=temp;
    		}
    		else if(temp.data==val && temp.next==null) {  //multiple nodes available & value is at the end
    			temp.next=newNode;
    			newNode.prev=temp;
    		}
    		else {
    			System.out.println("invalid position...");
    		}
    	}
    }
    public void display() {
    	if(head==null) {
    		System.out.println("list is empty");
    	}
    	else {
    		Node2 temp=head;
    		System.out.println("list is: ");
    		System.out.print("NULL<--");
    		while(temp!=null) {
        		System.out.print("| "+temp.data+" |-->");
    			temp=temp.next;
    		}
    		System.out.print("NULL");
    	}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_list_doubly list = new Linked_list_doubly();
        while (true) {
//            System.out.println("\n1. Insert at Beginning\n2. Insert at End\n3. Insert at any position\n4. Insert after any position\n5. Insert after any value\n6. Delete from Beginning\n7. Delete from end\n8. Delete from any position\n9. Delete from any Value\n10. Display\n11. Count Nodes\n12. Reverse\n13. Exit");
            System.out.println("\n1. Insert at Beginning\n2. Insert at End\n3. Insert at any position\n4. Insert after any position\n5. Insert after any value\n10. Display\n13. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the data: ");
                    int data = sc.nextInt();
                    list.insertAtBeg(data);
                    break;
                case 2:
                	System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                	System.out.print("Enter the data: ");
                    data = sc.nextInt();
                	list.insertAtAnyPos(data);
                	break;
                case 4:
                	System.out.print("Enter the data: ");
                    data = sc.nextInt();
                	list.insertAfterAnyPos(data);
                	break;
                case 5:
                	System.out.print("Enter the data: ");
                    data = sc.nextInt();
                	list.insertAfterAnyValue(data);
                	break;
//                case 6:
//                	list.delFromBeg();
//                	break;
//                case 7:
//                	list.delFromEnd();
//                	break;
//                case 8:
//                	list.delFromAnyPos();
//                	break;
//                case 9:
//                	list.delFromAnyValue();
//                	break;
                case 10:
                	list.display();
                    break;
//                case 11:
//                	list.countNodes();
//                	break;
//                case 12:
//                	list.reverseList();
//                	break;
                case 13:
                	System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice... Try again.");
            }
        }
    }

}
