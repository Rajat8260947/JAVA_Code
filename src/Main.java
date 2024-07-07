import java.util.Scanner;


//
class ArrayThread extends Thread {
    int[] array;

    ArrayThread(int[] array) {
        this.array = array;
    }

    public void run() {
        while(true) {
            for (int i = 0; i < 5; i++) {
                System.out.println(array[i]);
            }
        }
        }
    }


    public class Main {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {6, 7, 8, 9, 10};

            ArrayThread t1 = new ArrayThread(array1);
            ArrayThread t2 = new ArrayThread(array2);

            t1.start();
            t2.start();
        }
    }

