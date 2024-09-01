package New;

import java.util.Scanner;
//Insertion_sort--> starts from index 1 and compares with previous value max or not, if max then move it to next index & so on...
public class Sort_insertion {
	public static int[] sorting(int a[],int n) {
		 for(int i=1;i<n;i++) {
			 int temp=a[i];   //
			 int c=i-1; 
			 while(c>=0 && a[c]>temp) {
				 a[c+1]=a[c];
				 c--;
			 }
			 a[c+1]=temp;
		 }
		 return a;
	}	
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of data");
		 int n=sc.nextInt();
		 int[] a=new int[n];
		 //array input
		 System.out.println("enter the elements of array: ");
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 //new array to store return array
		 int[] ans=new int[n];
		 ans=sorting(a,n);
		 //display
		 System.out.print("the sorted array is: [");
		 for(int i=0;i<ans.length;i++) {
			 System.out.print(ans[i]+" "); 
		 }
		 System.out.print("]");
		 sc.close();
	 }
}
