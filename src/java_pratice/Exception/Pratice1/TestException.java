package java_pratice.Exception.Pratice1;

public class TestException {
    public static void main(String[] args) {
        try
        {
            String s=null;
            System.out.println(s.length());

            String s1="32";
            int i=Integer.parseInt(s1);
            System.out.println(i);
        }
        catch(NumberFormatException  e)
        {

            System.out.println("Number format exception");

        }

        catch(Exception e)
        {
            System.out.println(e);
            System.out.println(" other exception");

        }

        finally {
            System.out.println(" successfully run the program");
        }

    }

}
