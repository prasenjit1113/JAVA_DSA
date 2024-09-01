package New;

import java.util.Scanner;

public class Recursion_gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the x : ");
		int x=sc.nextInt();
		System.out.println("enter the y : ");
		int y=sc.nextInt();
		int result=GCD(x,y);
		System.out.print("result: "+result);
	}
	
	static int GCD(int x,int y){
		if(x==y){
			return x;     
		}
		else if(x>y){
			return GCD(x-y,y);
		}
		else {
			return GCD(x,y-x);
		}
	}

}
