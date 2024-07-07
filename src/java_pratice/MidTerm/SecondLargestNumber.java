package java_pratice.MidTerm;

import java.util.Scanner;

public class SecondLargestNumber {
    public static int  secondlargest(int arr[],int total)
    { int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i+1; j <total ; j++) {
                if (arr[i]>arr[j])
                {


                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr[total-2];

    }

    public static void main(String[] args) {

//        int [] arr={3,56,777,45,664,43}
//        ;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enters the numbers of elements in array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println(" Enter the array elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();

        }
        int  result = secondlargest(arr,10);
        System.out.println(" Second highest number is :"+ result);


    }

}
