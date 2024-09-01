package New;
import java.util.*;

class treeNode1{
	int data;
	treeNode1 lchild,rchild;
	treeNode1(int data){
		this.data=data;
		this.lchild=null;
		this.rchild=null;
	}
}

public class Tree_BST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tree_BST ob=new Tree_BST();
		treeNode1 root=null;
		while(true) {
			System.out.println("\n1. Insert\n2. Inorder\n3. Preorder\n4. Postorder\n5. Search\n6. Exit\n7. Maximum\n8. Minimum");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice) {
            	case 1:
            		System.out.print("enter the element: ");
            		int x=sc.nextInt();
            		root=ob.insert(root,x);
            		break;
            }
		}
	}
	
	public treeNode1 insert(treeNode1 root,int x) {
		treeNode1 new1 = new treeNode1(x);
		if(root==null) {
			root=new1;
			return new1;
		}
		while(true) {
			
		}
	}
}
