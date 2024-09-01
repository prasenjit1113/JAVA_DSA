package New;
import java.util.*;
public class Linear_search {
	
	public void search(int[] a) {
		Scanner sc=new Scanner(System.in);
		int flag=0,i=0;
		System.out.print("enter the value to search: ");
		int key=sc.nextInt();
		for(i=0;i<a.length;i++) {
			if(a[i]==key) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.print("value is found at position: "+i);
		}
		else {
			System.out.println("value not found");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("enter the elements of a["+i+"] : ");
			a[i]=sc.nextInt();
		}
		Linear_search l=new Linear_search();
		l.search(a);
	}

}
