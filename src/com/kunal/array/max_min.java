package com.kunal.array;

public class max_min {
    public static void main(String[] args) {
        int [] arr ={ 2,3,4,57,53};
        int max = maxval(arr);
        System.out.println("Maximum value is " + max);
        int min = minval(arr);
        System.out.println("Minimum value is " + min);
    }
      static int maxval(int[] arr){

        int max = arr[0];
        for (int i=1; i<arr.length ; i++){
            if(arr[i]>max){
                max =arr[i];
            }

        }
        return  max ;

      }
 static int minval(int[] arr){

        int min = arr[0];
        for (int i=1; i<arr.length ; i++){
            if(arr[i]<min){
                min =arr[i];
            }

        }
        return  min ;

      }

}
