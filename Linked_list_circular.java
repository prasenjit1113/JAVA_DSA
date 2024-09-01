package New;

import java.util.Scanner;

class Node3 {
    int data;   //stores the data (an integer) contained in the node.
    Node3 next;  //reference to the next node in the linked list
    
    Node3(int data) {  //constructor, The purpose of the constructor is to initialize the new object.
        this.data = data;  //The this keyword refers to the current instance of the class
        this.next = null;  //indicating that the node does not yet point to any other node.
    }
}

public class Linked_list_circular {
	Node3 head = null;  // The list is empty initially

    // Method to insert a new node at the beginning
    public void insertAtBeg(int data) {
    	Node3 newNode=new Node3(data);
    	if(head==null) {
    		head=newNode;
    		head.next=head; 
    	}
    	else {
    		Node3 temp=head;
    		while(temp.next!=head) {
    			temp=temp.next;
    		}
    		newNode.next=head;
    		head=newNode;
    		temp.next=head;
    		
    	}
    }
    public void insertAtEnd(int data) {
    	Node3 newNode=new Node3(data);
    	if(head==null) {
    		head=newNode;
    		head.next=head;
    	}
    	else {
    		Node3 temp=head;
    		while(temp.next!=head) {
    			temp=temp.next;
    		}
			temp.next=newNode;
			newNode.next=head;
    	}
    }
    public void insertAtAnyPos(int data) {
    	Node3 newNode = new Node3(data);
        if (head == null) {  //no node available
            head = newNode; 
            head.next=head;
        } 
        else {
        	Scanner sc=new Scanner(System.in);
        	System.out.print("enter the position to insert data: ");
        	int pos=sc.nextInt();
        	if(pos==1) {  //when position=1 
        		Node3 temp=head;
        		while(temp.next!=head) {
        			temp=temp.next;
        		}
        		newNode.next=head;
        		head=newNode;
        		temp.next=head;
        	}
        	else {
        		Node3 temp = head; //initializing in temp and we use temp for any operations as head can not be used to traverse ,it will make problem
        		int i=1;
        		while(i!=pos-1 && temp.next!=head) {  //traversing to fetch the node position
        			i++;
        			temp=temp.next;
        		}
        		if(i==pos-1 && temp.next!=head) {   //multiple nodes available & inserting between any two nodes
        			newNode.next=temp.next;
        			temp.next=newNode;
        		}
        		else if(i==pos-1 && temp.next==head) {   //multiple nodes available & inserting at the end
        			temp.next=newNode;
        			newNode.next=head;
        		}
        		else {
        			System.out.println("position not found...");
        		}
        	}
        }
    }
    public void delFromBeg() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		if(head.next==head) {
    			System.out.println("deleted data is: "+head.data);
    			head=null;
    		}
    		else {
    			Node3 temp=head;
    			Node3 temp2=head;
    			while(temp.next!=head) {
    				temp=temp.next;
    			}
    			head=head.next;
    			temp2.next=null;
    			temp.next=head;
    			System.out.println("deleted data is: "+temp2.data);
    		}
    	}
    }
    public void delFromEnd(){
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		if(head.next==head) {
    			System.out.println("deleted data is: "+head.data);
    			head=null;
    		}
    		else {
    			Node3 x=head;
    			Node3 temp=head.next;
    			while(temp.next!=head) {
    				temp=temp.next;
    				x=x.next;
    			}
    			x.next=head;
    			temp.next=null;
    			System.out.println("deleted data is: "+temp.data);
    		}
    	}
    }
    public void delFromAnyPos() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("enter the position to delete data: ");
    		int pos=sc.nextInt();
    		Node3 temp=head;
    		if(pos==1 && head.next==head) {   //position=1 & one node present
    			System.out.print("deleted data is: "+head.data);
    			head=null;
    		}
    		else if(pos==1 && head.next!=head) {   //position=1 & multiple nodes present
    			Node3 temp2=head;
    			while(temp.next!=head) {
    				temp=temp.next;
    			}
    			head=head.next;
    			temp2.next=null;
    			temp.next=head;
    			System.out.print("deleted data is: "+temp2.data);
    		}
    		else {
    			int i=1;
    			Node3 temp2=head;
    			while(i!=pos && temp.next!=head) {	
    				temp2=temp;
    				temp=temp.next;
    				i++;
    			}
    			if(i==pos && temp.next!=head) {    //node present between nodes
    				temp2.next=temp.next;
    				temp.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else if(i==pos && temp.next==head) {   //node present at the end
    				temp2.next=head;
    				temp.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else {
    				System.out.println("position not found...");
    			}
    		}
    	}
    }
    public void delFromAnyValue(){
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		Node3 temp=head;
    		Node3 temp2=head;
    		Scanner sc=new Scanner(System.in);
    		System.out.print("enter the key value to delete: ");
    		int key=sc.nextInt();
    		if(head.data==key && head.next==head) {
    			System.out.println("deleted data is: "+head.data);
    			head=null;
    		}
    		else if(head.data==key && head.next!=head){
    			while(temp.next!=head) {
    				temp=temp.next;
    			}
    			head=head.next;
    			temp2.next=null;
    			temp.next=head;
    			System.out.print("deleted data is: "+temp2.data);
    		}
    		else {
    			while(temp.data!=key && temp.next!=head) {
    				temp2=temp;
    				temp=temp.next;
    			}
    			if(temp.data==key && temp.next!=head) {
    				temp2.next=temp.next;
    				temp.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else if(temp.data==key && temp.next==head) {
    				temp2.next=head;
    				temp.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else {
    				System.out.println("value not found");
    			}
    		}
    	}
    }
    public void display() {
    	if(head==null) {
    		System.out.println("list is empty");
    	}
    	else {
    		Node3 temp=head;
    		System.out.println("list is: ");
    		System.out.print("HEAD-->");
    		do {
    			System.out.print("| "+temp.data+" |-->");
    			temp=temp.next;
    		}while(temp!=head);
    		System.out.print("HEAD");
    	}
    }
    
    public void countNodes() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		int count=0;
    		Node3 temp=head;
    		do {               //instead of do while, we can use any other loop also
    			temp=temp.next;
    			count++;
    		}while(temp!=head);
    		System.out.print("number of nodes are: "+count);
    	}
    }
    public void reverseList() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		Node3 temp=head;
    		Node3 temp2;
    		Node3 r=null,l=null;
    		int flag=0;
    		while(temp.next!=head) {
    			temp2=head;
    			while(temp2.next!=head) {
    				r=temp2;
    				temp2=temp2.next;
    			}
    			if(flag==0) {
//        			temp2.next=head;
        			head=temp2;
        			l=temp2;
        			flag=1;
        		}
    			else if(temp.next!=head) {
    				r.next=head;
    				temp2.next=l.next;
    				l.next=temp2;
    				l=l.next;
    			}
    		}
    	}
    }
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Linked_list_circular list = new Linked_list_circular();
	        while (true) {
//	            System.out.println("\n1. Insert at Beginning\n2. Insert at End\n3. Insert at any position\n4. Insert after any position\n5. Insert after any value\n6. Delete from Beginning\n7. Delete from end\n8. Delete from any position\n9. Delete from any Value\n10. Display\n11. Count Nodes\n12. Reverse\n13. Exit");
	            System.out.println("\n1. Insert at Beginning\n2. Insert at End\n3. Insert at any position\n6. Delete from Beginning\n7. Delete from end\n8. Delete from any position\n9. Delete from any Value\n10. Display\n11. Count Nodes\n12. Reverse\n13. Exit");
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
//	                case 4:
//	                	System.out.print("Enter the data: ");
//	                    data = sc.nextInt();
//	                	list.insertAfterAnyPos(data);
//	                	break;
//	                case 5:
//	                	System.out.print("Enter the data: ");
//	                    data = sc.nextInt();
//	                	list.insertAfterAnyValue(data);
//	                	break;
	                case 6:
	                	list.delFromBeg();
	                	break;
	                case 7:
	                	list.delFromEnd();
	                	break;
	                case 8:
	                	list.delFromAnyPos();
	                	break;
	                case 9:
	                	list.delFromAnyValue();
	                	break;
	                case 10:
	                	list.display();
	                    break;
	                case 11:
	                	list.countNodes();
	                	break;
	                case 12:
	                	list.reverseList();
	                	break;
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
