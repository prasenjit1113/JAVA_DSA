package New;
import java.util.Scanner;
class poly{
	int cof,exp;
	poly next;
	poly(int cof,int exp){
		this.cof=cof;
		this.exp=exp;
		this.next=null;
	}
}

public class PolynomialAddition_list {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        poly head1=null;
        poly head2=null;
        poly head3=null;
        
        System.out.print("enter the number of terms for poly 1:");
        int n=sc.nextInt();
        System.out.print("enter the number of terms for poly 2:");
        int m=sc.nextInt();
        
        PolynomialAddition_list ob=new PolynomialAddition_list();
        
        System.out.println("enter coefficients and exponents for poly 1:");
        head1=ob.input(n,sc);
        System.out.println("enter coefficients and exponents for poly 2:");
        head2=ob.input(m,sc);
        System.out.println("poly 1 is:");
        ob.display(head1);
        System.out.println("poly 2 is:");
        ob.display(head2);
        
        System.out.println("addition of the polynomials is: ");
        head3=ob.addition(head1, head2);
        ob.display(head3);
        
        sc.close();
        
    }
	public poly input(int n,Scanner sc) {
		poly head=null,temp=null;
		for(int i=0;i<n;i++) {
			System.out.print("enter the coefficient: ");
			int cof=sc.nextInt();
			System.out.print("enter the exponent: ");
			int exp=sc.nextInt();
			poly newNode=new poly(cof,exp);
			if(head==null) {
				head=newNode;
			}
			else {
				temp.next=newNode;
			}
			temp=newNode;
		}
		return head;
	}
	
	public void display(poly head) {
		poly temp=head;
		for(temp=head;temp!=null;temp=temp.next) {
			if(temp.exp!=0) {
				if(temp.next==null) {
					System.out.print(" ("+temp.cof+"X^"+temp.exp+") ");
				}
				else {
					System.out.print(" ("+temp.cof+"X^"+temp.exp+") + ");
				}
			}
		}
		System.out.println();
	}
	
	public poly addition(poly head1,poly head2) {
		poly head3=null,temp=null;
		while(head1!=null && head2!=null) {
			int c=0,e=0;
			if(head1.exp>head2.exp) {
				c=head1.cof;
				e=head1.exp;
				head1=head1.next;
			}
			else if(head1.exp<head2.exp) {
				c=head2.cof;
				e=head2.exp;
				head2=head2.next;
			}
			else {
				c=head1.cof+head2.cof;
				e=head1.exp;
				head1=head1.next;
				head2=head2.next;
			}
			poly newNode=new poly(c,e);
			if(head3==null) {
				head3=newNode;
			}
			else {
				temp.next=newNode;
			}
			temp=newNode;
		}
		while(head1!=null) {
			poly newNode=new poly(head1.cof,head1.exp);
			if(head3==null) {
				head3=newNode;
			}
			else {
				temp.next=newNode;
			}
			temp=newNode;
			head1=head1.next;
		}
		while(head2!=null) {
			poly newNode=new poly(head1.cof,head1.exp);
			if(head3==null) {
				head3=newNode;
			}
			else {
				temp.next=newNode;
			}
			temp=newNode;
			head2=head2.next;	
		}
		return head3;
	}

}
