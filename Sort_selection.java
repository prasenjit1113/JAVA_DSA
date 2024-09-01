package New;
import java.util.*;
//Selection_sort -->takes the maximum element from array and move it to the end ,then takes 2nd max & move 2nd last and so on...
public class Sort_selection {
	//method for selection sort
	public static int[] sorting(int a[],int n) {
		int j;
		 for(int i=0;i<n-1;i++) {
			 int index=0;     //assuming 1st index value is max
			 int max=a[0];   //assuming 1st value is max
			 for(j=0;j<n-i;j++) {   //n-i as each time the max value is shifted to last..so loop decreases
				 if(a[j]>max) {    //">" -->for ascending order sort  //"<" --> for descending order sort
					 max=a[j];
					 index=j;
				 }
			 }
			 if(index!=j-1) {    //if max value index is not the last index ,then move the max value to end index
				 int temp=a[index];
				 a[index]=a[j-1];
				 a[j-1]=temp;
			 }
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
