package java_pratice.Multithreading;
class MyThreadRunnable1 implements Runnable
{

    @Override
    public void run() {
        while(true) {
            System.out.println(" I m Raja t");
        }
    }
}class MyThreadRunnable2 implements Runnable
{

    @Override
    public void run() {
        while (true){
            System.out.println(" I m Raghavan");
        }
    }
}

public class Run {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1= new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2= new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
