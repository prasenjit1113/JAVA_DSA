package New;

import java.util.Scanner;

public class Binary_search {
	public void search(int[] a) {
		Scanner sc=new Scanner(System.in);
		int flag=0,mid=0,low=0,upp=a.length-1;
		System.out.print("enter the value to search: ");
		int key=sc.nextInt();
		while(low<=upp) {
			mid=(low+upp)/2;
			if(a[mid]==key) {
				flag=1;
				break;
			}
			if(key>a[mid]){
				low=mid+1;
			}
			else {
				upp=mid-1;
			}
		}
		if(flag==1) {
			System.out.print("value is found at position: "+mid);
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
		System.out.println("enter the elements in sorted order: ");
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"] : ");
			a[i]=sc.nextInt();
			if(i>0&&a[i-1]>a[i]) {
				System.out.println("wrong input...data should be in ascending order... try again");
				System.exit(1);
			}
		}
		Binary_search b=new Binary_search();
		b.search(a);
	}

}
