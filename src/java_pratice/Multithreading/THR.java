package java_pratice.Multithreading;
class Thr1 extends Thread
{
    public Thr1(String name){
        super(name);
    }
    public void run()
    {
        int i=34;
        System.out.println(" Thank You");
//        while(true)
//        {
//            System.out.println("I am Thread ");
//        }
    }

}
public class THR {
    public static void main(String[] args) {
        Thr1 t=new Thr1("Harry");
        Thr1 t2=new Thr1("Rajat");
        t.start();
        System.out.println(" the id of thread t is " + t.getId());
        System.out.println(" the name of  of thread t is " + t.getName());
        System.out.println(" the id of thread t2 is " + t2.getId());
        System.out.println(" the name of  of thread t2 is " + t2.getName());



    }
}
