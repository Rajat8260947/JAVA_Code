package java_pratice.Exception.Pratice1;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        int [] marks= new int[5];
        marks[0]=56;
        marks[1]=58;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the Array Index");
        int ind = sc.nextInt();
        try
        {
            System.out.println(" Welcome to video no 82");
            try
            {
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(" Sorry this index dose not exit");
                System.out.println( " Exception level 2");

            }
        }
        catch (Exception e)
        {
            System.out.println(" exception Level 1");

        }

    }
}
