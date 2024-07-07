package java_pratice.inheritance;
 class Hello
 {
     {
         show();

     }
     Hello()
     {
         System.out.println(" hello constructor");
         show();

     }
     void show()
     {
         System.out.println(" hello method");
     }
 }
  class Hi extends Hello
  {
      Hi()
      {
          super();
          System.out.println(" Hi constructor");
      }

          @Override
          void show() {
              System.out.println(" Hi method");


      }
  }
public class Inheritance1  extends Hi{
    public static void main(String[] args) {
        Hi obj =new Hi();
        obj.show();

    }
}
