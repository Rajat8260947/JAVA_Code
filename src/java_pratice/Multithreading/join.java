package java_pratice.Multithreading;
class MyThr2 extends Thread
{
 public void run()
    {
         int i=0;
        while(true) {
            System.out.println(" Thank you");
            try {
                Thread.sleep(455);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();

            }


        }
    }

}
class MyThr3 extends Thread
{
 public void run()
    {
         int i=0;
        while(true)
        {
            System.out.println("  My Thank you");

        }
    }
}
public class join {
    public static void main(String[] args)
    {
        MyThr2 t1= new MyThr2();
        MyThr3 t2= new MyThr3();
        t1.start();
//        try
//        {
////            t1.join();
//
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        t2.start();

    }
}
