package java_pratice.Exception.Pratice1;

import java.util.Scanner;

public class Pratice2 {
    public static void main(String[] args) {

        int [] marks= new int[5];
          marks[0]=56;
          marks[1]=58;
          marks[2]=6;
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the array Index");
         int ind= sc.nextInt();
        System.out.println(" Enter  the number  you want to divide with the value");
        int number= sc.nextInt();

        try{
            System.out.println(" The value at array index entered is : " + marks[ind] );
            System.out.println(" the value of array -value / number is : " + marks[ind]/number );
        }
        catch(ArithmeticException e)
        {
            System.out.println(" ArithmeticException exception occured!");
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }catch(Exception e)
        {
            System.out.println(" Some  other  exception occured!");
            System.out.println(e);

        }

    }
}
