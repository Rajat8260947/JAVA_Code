package com.kunal.array;

public class missing {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7};
        int num =7;
       int  misval = miss(arr,num);
        System.out.println("Missing value is " + misval);
       
    }
    static  int miss(int [] arr, int num){
        int sum =0;
        for (int i = 1; i <=num ; i++) {
            
            sum+=i;
        }
        for (int i = 0; i < arr.length ;i++) {
             sum-=arr[i];
        }
        return sum;
    }
    
}
