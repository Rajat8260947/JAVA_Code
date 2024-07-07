package com.kunal.array;



import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][]arr=new int[3][];
        int[][] num = {
                {1, 2, 3},
                {4, 5},
                {6}
        };


//        int[][] num = new int[3][3];
////        System.out.println(num.length);
//        System.out.println("enter array element");
//        for (int row = 0; row < num.length; row++) {
//            for (int col = 0; col < num[row].length; col++) {
//                num[row][col] = in.nextInt();
//
//            }
//
//        }
//         for( int row =0; row< num.length;row++)
//
//         for (int col=0; col<num[row].length;col++)
//         {
//             System.out.print(num[row][col]+ " ");

        for ( int row =0; row< num.length;row++)
        {
            System.out.println(Arrays.toString(num[row]));
        }
//
        for(int[]a:num){
            System.out.println(Arrays.toString(a));
        }
    }
}


