package com.kunal.array;

public class Maxvalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 35, 64, 776, 33};
        int a = maxvalue(arr);
        int b=  minvalue(arr);
        System.out.println(" maximum value is " + a);
        System.out.println(" Minimum value is " + b);


    }

    static int maxvalue(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

        static int minvalue (int []arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;

        }
    }
