package New;

import java.util.Scanner;
//Sort_bubble--> checking 1st two index values if a[0]>a[1], then swap and so on...
public class Sort_bubble {
	public static int[] sorting(int a[],int n) {
		 for(int i=0;i<n-1;i++) {
			 int flag=0;
			 for(int j=0;j<n-i-1;j++) {
				 if(a[j]>a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 flag=1;
				 }
			 }
			 if(flag==0) {
				 break;
			 }
		 }
		 return a;
	}	
	 public static void main(String[] args) {
		System.out.println("helloo I am checking github for updation...");
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
