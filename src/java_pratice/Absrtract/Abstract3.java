package java_pratice.Absrtract;
abstract  class hag{
    abstract void a_method();

    void normalMethod() {
        System.out.println(" this is is normal method ");

    }

    public hag() {
        System.out.println(" This is  abstract  constructor ");
    }
}
     class sub extends  hag
     {
         @Override
         void a_method() {
             System.out.println(" this is abstract method ");
         }
     }


public class Abstract3 {
    public static void main(String[] args) {
        sub S= new sub();
         S.a_method();
         S.normalMethod();



    }
}
