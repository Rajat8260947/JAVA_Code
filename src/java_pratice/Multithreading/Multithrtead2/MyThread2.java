//package java_pratice.Multithreading.Multithrtead2;

// Using the Thread Class: Thread(String Name)
//class Test3 extends Thread
//{
//
//    @Override
//    public void run() {
//        System.out.println(" I am running1 ");
//    }
//
//}
//
//
//public class MyThread2 {
//    public static void main(String[] args) {

//        Thread t1 = new Thread(" I am Thread");
//        Test3 t2 = new Test3();
//
//        System.out.println(t1.getName());
//        t2.start();
//
//
//    }
//}
package java_pratice.Multithreading.Multithrtead2;

// Using the Thread Class: Thread(Runnable r, String name)

class Test3 implements Runnable
{

    @Override
    public void run() {
        System.out.println(" I am running1 ");
    }

}


public class MyThread2 {
    public static void main(String[] args) {

        Test3 t2 = new Test3();
        Thread t1 = new Thread( t2," I am Thread");

        System.out.println(t1.getName());
        t1.start();


    }
}