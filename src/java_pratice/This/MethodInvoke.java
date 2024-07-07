package java_pratice.This;
class Raja
{
    void m()
    {
        System.out.println(" I am Rajat");
    }

    void n()
    {
        this.m();
        System.out.println(" I am Raghav");
//        this.m();
    }

}

public class MethodInvoke {
    public static void main(String[] args) {
         Raja R=new Raja();
         R.n();

    }
}
