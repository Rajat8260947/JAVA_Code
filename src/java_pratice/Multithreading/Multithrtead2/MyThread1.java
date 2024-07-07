//package java_pratice.Multithreading.Multithrtead2;
//class Test1 extends Thread
//{
//    @Override
//    public void run() {
//        System.out.println(" I am running1 ");
//    }
//}class Test2 extends Thread
//{
//    @Override
//    public void run() {
//        System.out.println(" I am running2");
//    }
//}
//
//public class MyThread1 {
//    public static void main(String[] args) {
//        Test1 t1 = new Test1();
//        Test2 t2 = new Test2();
//        t1.start();
//        t2.start();
//
//    }
//}
package java_pratice.Multithreading.Multithrtead2;
class Test1 implements Runnable
{
    @Override
    public void run() {
        System.out.println(" I am running1 ");
    }
}class Test2  implements Runnable
{
    @Override
    public void run() {
        System.out.println(" I am running2");
    }
}

public class MyThread1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Thread r1 = new Thread(t1);

        Test2 t2 = new Test2();
        Thread r2 = new Thread(t2);

        r1.start();
        r2.start();

    }
}
