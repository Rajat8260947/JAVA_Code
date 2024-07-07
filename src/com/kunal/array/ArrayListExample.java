package com.kunal.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
         list.add(65);
         list.add(67);
         list.add(87);
         list.add(89);
         list.add(78);
//        System.out.println(list.contains(76));
//        System.out.println( list);
//        list.set(0,99);
//        list.remove(3);
//        System.out.println(list);

        System.out.println(" input arraylistelement");
        for(int i=0; i<5;i++)//doubt increases more element or not ;
        {
            list.add(in.nextInt());

        }
        for (int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
