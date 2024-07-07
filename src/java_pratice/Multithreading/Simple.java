package java_pratice.Multithreading;
 class MyThread1 extends  Thread
 {

    public  void run()
     {
         while(true)
         {
             System.out.println("My cooking Thread is Running ");
             System.out.println(" I am Happy");

         }
     }

 }class MyThread2 extends  Thread
 {

    public  void run()
     {
         while(true)
         {
             System.out.println("I am chatting with my brother ");
             System.out.println(" I am sad");

         }
     }

 }
public class Simple {
    public static void main(String[] args) {

        MyThread1 obj1= new MyThread1();
        MyThread2 obj2= new MyThread2();
        obj1.start();
        obj2.start();

    }


}
