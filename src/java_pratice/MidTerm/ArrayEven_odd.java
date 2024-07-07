package java_pratice.MidTerm;

import java.util.Scanner;

public class ArrayEven_odd {
    public static void main(String[] args) {

        int sum=0;
        int mul=1;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enters the numbers of elements in array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println(" Enter the array elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
            else
            {
               mul=mul*arr[i];
            }


        }

        System.out.println(" Sum of even number are : " + sum);
        System.out.println(" Multiplication of odd numbers are : =" + mul);

    }
}
