package New;

import java.util.Scanner;

public class Recursion_print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array elemnts: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("array elemnts are: ");
		print(arr,n-1);
	}
	static void print(int[] arr,int n){
		if(n==-1){
			return;      //	System.exit(0);
		}
		
//		System.out.println(arr[n]);  //print in reverse order
		print(arr,n-1);
		System.out.println(arr[n]);  //print as it is
	}
}
