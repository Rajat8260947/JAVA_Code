package java_pratice.MidTerm;

import java.util.Scanner;

public class UnitMatrix {
    public static void main(String[] args) {

        int [][]arr =new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[1].length ; j++)
            {
                if(i==j)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }
}
