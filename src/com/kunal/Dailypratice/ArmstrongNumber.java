package com.kunal.Dailypratice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int result;
//        Scanner sc= new Scanner(System.in);
//        System.out.println(" enter the number :");
//        int n=  sc.nextInt();

//        result= armstrong(n);
        for (int i = 100; i <1000 ; i++)
            if (armstrong(i)) {
                System.out.println(i + " ");
            }
//        if (result==n)
//        {   System.out.println( n + "  is armstrong");
//        }
//
//        else
//        {
//            System.out.println(n +" is not armstrong");
//        }



    }
    static  boolean armstrong( int n)
    {
        int original=n;
        int r;
        int sum =0;
//        Scanner sc= new Scanner(System.in);
//        System.out.println(" enter the number :");
//        int n=  sc.nextInt();
        while (n!=0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }

        {
            if(sum== original)

            return  true;
        }
        return  false;
    }
}
