package java_pratice.MidTerm;

class vehicle {
    void run() {
        System.out.println(" vehicle is running");
    }
}
   class bike extends vehicle
   {
       @Override
       void run() {
           System.out.println(" Bike is running");
       }
   }




public class MethodOverriding {
    public static void main(String[] args) {
       bike b1= new bike();
       b1.run();
    }
}
