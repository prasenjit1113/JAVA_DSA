package New;

import java.util.Scanner;
class Node {
    int data;   //stores the data (an integer) contained in the node.
    Node next;  //reference to the next node in the linked list
    
    Node(int data) {  //constructor, The purpose of the constructor is to initialize the new object.
        this.data = data;  //The this keyword refers to the current instance of the class
        this.next = null;  //indicating that the node does not yet point to any other node.
    }
}

public class Linked_list_singly {
	Node head = null;  // The list is empty initially

    // Method to insert a new node at the beginning
    public void insertAtBeg(int data) {
        Node newNode = new Node(data); // Step 1: Create a new node with the given data
        if (head == null) {
            head = newNode;  // The new node becomes the head of the list
        } 
        else {
            newNode.next = head;   // Step 2: Point the new node's next to the current head
            head = newNode;        //Step 3: Update head to be the new nod
        }
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  
        } 
        else {
        	Node temp = head; //initializes a temporary pointer temp to point to the head of the linked list
        	while(temp.next!=null) {    
        		temp=temp.next;
        	}
        	temp.next=newNode;   // here found temp.next=null ,so here to insert new node
            newNode.next=null;   //after inserting new node assign next part to null, as inserting at end
        }
    }
    public void insertAtAnyPos(int data) {
    	Node newNode = new Node(data);
        if (head == null) {  //no node available
            head = newNode;  
        } 
        else {
        	Scanner sc=new Scanner(System.in);
        	System.out.print("enter the position to insert data: ");
        	int pos=sc.nextInt();
        	if(pos==1) {  //when position=1 & only one node available
        		newNode.next=head;
        		head=newNode;
        	}
        	else {
        		Node temp = head; //initializing in temp and we use temp for any operations as head can not be used to traverse ,it will make problem
        		int i=1;
        		while(i!=pos-1 && temp.next!=null) {  //traversing to fetch the node position
        			i++;
        			temp=temp.next;
        		}
        		if(i==pos-1 && temp.next!=null) {   //multiple nodes available & inserting between any two nodes
        			newNode.next=temp.next;
        			temp.next=newNode;
        		}
        		else if(i==pos-1 && temp.next==null) {   //multiple nodes available & inserting at the end
        			temp.next=newNode;
        		}
        		else {
        			System.out.println("position not found...");
        		}
        	}
        }
    }
    public void insertAfterAnyPos(int data) {
    	Node newNode = new Node(data);
        if (head == null) {  //no node available
            head = newNode;  
        } 
        else {
        	Scanner sc=new Scanner(System.in);
        	System.out.print("enter the position after which you want to insert data: ");
        	int pos=sc.nextInt();	
//        	if(pos==1 && head.next==null) {  //when position=1 & only one node available
//        		head.next=newNode;
//        	}
//        	else if(pos==1 && head.next!=null) {  //when position=1 & multiple nodes available
//        		newNode.next=head.next;
//        		head.next=newNode;
//        	}
//        	else {
        	    Node temp = head; //initializing in temp and we use temp for any operations as head can not be used to traverse ,it will make problem
        		int i=1;
        		while(i!=pos && temp.next!=null) {  //traversing to fetch the node position
        			i++;
        			temp=temp.next;
        		}
        		if(i==pos && temp.next!=null) {   //multiple nodes available & inserting between any two nodes
        			newNode.next=temp.next;
        			temp.next=newNode;
        		}
        		else if(i==pos && temp.next==null) {   //multiple nodes available & inserting at the end
        			temp.next=newNode;
        		}
        		else {
        			System.out.println("position not found...");
        		}
//        	}
        }
    }
    public void insertAfterAnyValue(int data) {
    	Node newNode = new Node(data);
    	if(head==null) {
    		head=newNode;
    	}
    	else {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("enter the value after which you want to insert : ");
    		int val=sc.nextInt();
//    		if(head.data==val && head.next==null) {
//    			head.next=newNode;	
//    		}
//    		else if(head.data==val && head.next!=null){
//    			newNode.next=head.next;
//    			head.next=newNode;	
//    		}
//    		else {
        		Node temp=head;
        		while(temp.data!=val && temp.next!=null) {  //traversing to fetch the node value
        			temp=temp.next;
        		}
        		if(temp.data==val && temp.next!=null) {   //multiple nodes available & value is between any two nodes
        			newNode.next=temp.next;
        			temp.next=newNode;
        		}
        		else if(temp.data==val && temp.next==null) {  //multiple nodes available & value is at the end
        			temp.next=newNode;
        		}
        		else {
        			System.out.println("invalid position...");
        		}
//    		}
    	}
    }
    
    public void delFromBeg() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		if(head.next==null) {
    			System.out.println("deleted data is: "+head.data);
    			head=null;
    		}
    		else {
    			Node temp=head;
    			head=head.next;
    			temp.next=null;
    			System.out.println("deleted data is: "+temp.data);
    		}
    	}
    }
    public void delFromEnd() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		if(head.next==null) {
    			System.out.println("deleted data is: "+head.data);
    			head=null;
    		}
    		else {
    			Node x=head;
    			Node temp=head.next;
    			while(temp.next!=null) {
    				temp=temp.next;
    				x=x.next;
    			}
    			x.next=null;
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
    		Node temp=head;
    		if(pos==1 && head.next==null) {   //position=1 & one node present
    			System.out.print("deleted data is: "+head.data);
    			head=null;
    		}
    		else if(pos==1 && head.next!=null) {   //position=1 & multiple nodes present
    			head=head.next;
    			temp.next=null;
    			System.out.print("deleted data is: "+temp.data);
    		}
    		else {
    			int i=1;
    			Node temp2=head;
    			while(i!=pos && temp.next!=null) {	
    				temp2=temp;
    				temp=temp.next;
    				i++;
    			}
    			if(i==pos && temp.next!=null) {    //node present between nodes
    				temp2.next=temp.next;
    				temp.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else if(i==pos && temp.next==null) {   //node present at the end
    				temp2.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else {
    				System.out.println("position not found...");
    			}
    		}
    	}
    }
    public void delFromAnyValue() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("enter the key data to delete : ");
    		int key=sc.nextInt();
    		Node temp=head;
    		if(head.data==key && head.next==null) {   //position=1 & one node present
    			System.out.print("deleted data is: "+head.data);
    			head=null;
    		}
    		else if(head.data==key && head.next!=null) {   //position=1 & multiple nodes present
    			head=head.next;
    			temp.next=null;
    			System.out.print("deleted data is: "+temp.data);
    		}
    		else {
    			Node temp2=head;
    			while(temp.data!=key && temp.next!=null) {	
    				temp2=temp;
    				temp=temp.next;
    			}
    			if(temp.data==key && temp.next!=null) {    //node present between nodes
    				temp2.next=temp.next;
    				temp.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else if(temp.data==key && temp.next==null) {   //node present at the end
    				temp2.next=null;
    				System.out.print("deleted data is: "+temp.data);
    			}
    			else {
    				System.out.println("value does not exixts...");
    			}
    		}
    	}
    }
    public void countNodes() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		int count=0;
    		Node temp=head;
    		while(temp!=null) {
				temp=temp.next;
    			count++;
    		}
    		System.out.println("number of nodes is: "+(count));
    	}
    }
    public void reverseList() {
    	if(head==null) {
    		System.out.println("list is empty...");
    	}
    	else {
    		Node temp=head;
    		int flag=0;
    		Node temp2;
    		Node r=null,l=null;  // r-->(last node-1).next==null , l-->points last node which is just reversed
    		while(temp.next!=null) {   //temp holds the 1st node which will be last node after reverse
    			temp2=head;
    			while(temp2.next!=null) {   //finding the last node
    				r=temp2;
    				temp2=temp2.next;
    			}
    			if(flag==0) {   //changing the link for the 1st time only
    				r.next=null;   
    				temp2.next=head;
    				head=temp2;
    				l=temp2;
    				flag=1;
    			}
    			else if(temp.next!=null){   //changing the link for other nodes
    				r.next=null;
    				temp2.next=l.next;
    				l.next=temp2;
    				l=l.next;
    			}
    		}
    	}
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
        } 
        else {
//        	By using a temporary pointer temp, we can traverse the list without modifying the head reference.
            Node temp = head;   //initializes a temporary pointer temp to point to the head of the linked list
            System.out.print("Linked list: head-->");
            while (temp != null) {
                System.out.print("|" + temp.data + "|-->");
                temp = temp.next;  //we move the temporary pointer to the next node, continuing the traversal.
            }
//            for(temp=head;temp!=null;temp=temp.next) {
//            	System.out.print("|" + temp.data + "|-->");
//            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_list_singly list = new Linked_list_singly();
        while (true) {
            System.out.println("\n1. Insert at Beginning\n2. Insert at End\n3. Insert at any position\n4. Insert after any position\n5. Insert after any value\n6. Delete from Beginning\n7. Delete from end\n8. Delete from any position\n9. Delete from any Value\n10. Display\n11. Count Nodes\n12. Reverse\n13. Exit");
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
