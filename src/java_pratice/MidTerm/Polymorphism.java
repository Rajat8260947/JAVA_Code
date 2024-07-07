package java_pratice.MidTerm;
 class Bank
 {
     float getRateOfInterest()
     {
         return(0);
     }
 }

 class SBI extends  Bank
 {
     @Override
     float getRateOfInterest()
     {
         return (8.4f);
     }

 }class ICIC extends  Bank
 {
     @Override
     float getRateOfInterest()
     {
         return (7.3f);
     }

 }class AXIS extends  Bank
 {
     @Override
     float getRateOfInterest()
     {
         return (9.7f);
     }

 }


public class Polymorphism {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
        System.out.println(" SBI getRateOfInterest " + b.getRateOfInterest());
        b=new ICIC();
        System.out.println(" ICIC getRateOfInterest " + b.getRateOfInterest());
        b=new AXIS();
        System.out.println(" AXIS getRateOfInterest " + b.getRateOfInterest());

    }
}
