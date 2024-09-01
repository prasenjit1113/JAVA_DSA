package New;
//factorial using recursion and Tail recursion

import java.util.Scanner;

public class Recursion_factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num : ");
		int n=sc.nextInt();
		int result=factorial(n);
		System.out.print("result: "+result);
	}
	
	static int factorial(int n){
		if(n==0 || n==1){
			return 1;      //	System.exit(0);
		}
		else {
			int temp=factorial(n-1)*n;
			return temp; 
		}
	}
}	
		
	//when the last line of a code is a recursive call, then this type of recursion is called Tail recursion.
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the num : ");
//		int n=sc.nextInt();
//		int result=factorial(n,1);
//		System.out.print("result: "+result);
//	}
//	
//	static int factorial(int n,int i){
//		if(n==0 || n==1){
//			return i;   
//		}
//		else {
//			return factorial(n-1,n*i); //tail recursion
//		}
//	}
//}
