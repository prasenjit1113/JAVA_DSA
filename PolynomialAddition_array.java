package New;

import java.util.Scanner;

class Polynomial {
    int cof;
    int exp;

    Polynomial(int cof, int exp) {
        this.cof = cof;
        this.exp = exp;
    }
}

public class PolynomialAddition_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Polynomial[] p1 = new Polynomial[10];
        Polynomial[] p2 = new Polynomial[10];
        Polynomial[] p3 = new Polynomial[20];

        // 1st polynomial
        System.out.print("Enter the number of terms in the 1st polynomial: ");
        int n = sc.nextInt();
        System.out.println("\nEnter the terms of the 1st polynomial in decreasing order with respect to exponent:");
        input(p1, n, sc);
        System.out.println("\n1st Polynomial is: ");
        display(p1, n);

        // 2nd polynomial
        System.out.print("\nEnter the number of terms in the 2nd polynomial: ");
        int m = sc.nextInt();
        System.out.println("\nEnter the terms of the 2nd polynomial in decreasing order with respect to exponent:");
        input(p2, m, sc);
        System.out.println("\n2nd Polynomial is: ");
        display(p2, m);

        // Addition of polynomials
        int i = 0;  // for traversing the 1st polynomial
        int j = 0;  // for traversing the 2nd polynomial
        int k = 0;  // for traversing the 3rd polynomial
        while (i < n && j < m) {
            if (p1[i].exp == p2[j].exp) { // if exponents match
                p3[k] = new Polynomial(p1[i].cof + p2[j].cof, p1[i].exp);  // then store in 3rd poly
                i++;
                j++;
            } else if (p1[i].exp > p2[j].exp) {
                p3[k] = new Polynomial(p1[i].cof, p1[i].exp);
                i++;
            } else {
                p3[k] = new Polynomial(p2[j].cof, p2[j].exp);
                j++;
            }
            k++; // for each condition k is increasing so, k is written outside the condition
        }
        while (i < n) { // as main while loop is false because of j==m but still values are available in poly 1
            p3[k] = new Polynomial(p1[i].cof, p1[i].exp);
            i++;
            k++;
        }
        while (j < m) { // as main while loop is false because of i==n but still values are available in poly 2
            p3[k] = new Polynomial(p2[j].cof, p2[j].exp);
            j++;
            k++;
        }

        System.out.println("\n\nAddition of Polynomials is: ");
        display(p3, k);

        sc.close();
    }

    public static void input(Polynomial[] p, int x, Scanner sc) {
        for (int i = 0; i < x; i++) {
            System.out.print("\nEnter the coefficient: ");
            int coef = sc.nextInt();
            System.out.print("Enter the exponent: ");
            int exp = sc.nextInt();
            p[i] = new Polynomial(coef, exp);
        }
    }

    public static void display(Polynomial[] p, int x) {
        for (int i = 0; i < x; i++) {
            if (i == x - 1) {
                System.out.printf("(%d)X^%d", p[i].cof, p[i].exp);
            } else {
                System.out.printf("(%d)X^%d+", p[i].cof, p[i].exp);
            }
        }
        System.out.println();
    }
}
