package java_pratice.Exception.Pratice1;
public class ResolveException {

    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try
        {
            data=i/j; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // resolving the exception in catch block
            System.out.println(e +  " Arithmetic Exception");
            System.out.println(i/(j+2));
        }
    }
}
