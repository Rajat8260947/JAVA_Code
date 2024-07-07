package java_pratice.Static;
 class calculator
 {
     static int cube(int x){
         return x*x*x;
     }
 }
   public class Calculate
   {
       public static void main(String[] args) {
          int result= calculator.cube(5);
           System.out.println(result);


       }
   }
