package java_pratice.MidTerm;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the first number :");
        a=sc.nextInt();
        System.out.println(" enter second number :");
        b= sc.nextInt();
        System.out.println("Before Swap value of a & b " + a + " " + b);
        c=a;
        a=b;
        b=c;
        System.out.println("After  Swap value of a & b " + a + " " + b);

    }
}
