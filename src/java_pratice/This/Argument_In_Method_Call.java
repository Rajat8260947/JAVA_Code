package java_pratice.This;


class Rajat
{
    void m(Rajat obj)
    {
        System.out.println(" I am Rajat");
    }

    void n()
    {
       m(this);// argument passing in method call;
        System.out.println(" I am Raghav");

    }

}

public class Argument_In_Method_Call {
    public static void main(String[] args) {
        Rajat R=new Rajat();
        R.n();

    }
}

