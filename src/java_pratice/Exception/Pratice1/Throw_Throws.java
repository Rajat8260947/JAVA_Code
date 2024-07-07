package java_pratice.Exception.Pratice1;
 class NegativeRadiusException  extends  Exception
 {
     @Override
     public String toString()
     {
         return  " Radius can not be negative!";
     }

     @Override
       public String getMessage()
     {
         return  "Radius can not be negative!";
     }
 }
   public   class Throw_Throws
   {
    public static  double area(int r) throws  NegativeRadiusException
    {
        if (r<0)
        {
            throw  new ArithmeticException("Negative number input");

        }

        double result = Math.PI * r *r;
        return  result;
    }
    static   int divide(int a, int b)  throws ArithmeticException
     {
         int result =a/b;
          return  result;
     }
    public static void main(String[] args) {
        try
        {
//                int c= divide(6,0);
//                System.out.println(c);
            double ar= area(-2);
            System.out.println(ar);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
            System.out.println(e);
        }


    }
}
