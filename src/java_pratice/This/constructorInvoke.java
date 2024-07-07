package java_pratice.This;
 class School
 {
     public  School()
     {
         System.out.println(" I am school");
     }
     public School(String  name)
     {
         this();
         System.out.println(" School Name is" + name);
     }
 }
public class constructorInvoke {
    public static void main(String[] args) {
      School s= new School(" BB High school");
    }
}
