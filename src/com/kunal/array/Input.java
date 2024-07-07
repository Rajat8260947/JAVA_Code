package com.kunal.array;

//import jdk.internal.icu.lang.UCharacterDirection;
import  java .util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 145;
        arr[3] = 14;
        arr[4] = 45;
//        arr[5]=56;

//        System.out.println(arr[3]);

//        input using arrays
//        System.out.println(" input the array element");
//       for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//         for( int num:arr){
//             System.out.print(num+ " ");
//         }

//        array of object
        String[] str= new String[4];
        System.out.println("Enter the string");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]= "kunal";
        System.out.println(str[1]);
        System.out.println(Arrays.toString(str));

    }
}
//
