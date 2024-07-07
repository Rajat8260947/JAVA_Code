package com.kunal.array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int col;
        int sum=0;
        double avg;
        Scanner  sc= new Scanner(System.in);
        System.out.println(" enter thr row and column size ");
        int row = sc.nextInt();
         col=  sc.nextInt();
        int[][] arr1;
        arr1 = new int  [row][col];

        System.out.println(" enter array elements :");
        for (int i = 0; i < arr1.length ; i++)
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j]=sc.nextInt();
                sum=sum+arr1[i][j];

            }
        System.out.println(" elements are : ");
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");


            }
            System.out.println();

        }

        avg=sum/(row*col);
        System.out.println(" sum of all elements are " + sum);
        System.out.println(" average is " + avg);


    }
}
