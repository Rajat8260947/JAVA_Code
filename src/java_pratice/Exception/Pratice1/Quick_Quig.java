package java_pratice.Exception.Pratice1;

import java.util.Scanner;

public class Quick_Quig {



        public static void main(String[] args) {
            int[] marks = new int[5];
            marks[0] = 56;
            marks[1] = 58;
            marks[2] = 6;
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println(" enter the Array Index");
                int ind = sc.nextInt();

                try {

                    try {
                        System.out.println(marks[ind]);
                        flag = false;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(" Sorry this index dose not exit");
                        System.out.println(" Exception level 2");

                    }
                } catch (Exception e) {
                    System.out.println(" exception Level 1");

                }


            }
        System.out.println(" Thanks   for using this pogram");
        }
    }
