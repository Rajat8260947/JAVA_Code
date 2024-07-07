package java_pratice.Absrtract;
abstract class Marks{
    abstract  void getpercentage();

    double mark1;
    double mark2;
    double mark3;
    double mark4;

}
 class A extends  Marks {
     public A(double mark1, double mark2, double mark3) {
         this.mark1 = mark1;
         this.mark2 = mark2;
         this.mark3 = mark3;
     }

     @Override
     void getpercentage() {
         double percentage = (mark1 + mark2 + mark3) / 3;
         System.out.println(" percentage of mark student A is " + percentage + " %");
     }
 }
     class B extends  Marks
 {
     public B( double mark1,double mark2, double mark3,double mark4){
         this.mark1=mark1;
         this.mark2=mark2;
         this.mark3=mark3;
         this.mark4=mark4;
     }

     @Override
     void getpercentage()
     {
         double percentage= (mark1+mark2+mark3+mark4)/4;
         System.out.println(" percentage of  mark student B is "+ percentage +" %");
     }
 }


public class Abstract4 {
    public static void main(String[] args) {
         A a= new A(56,76,98);
         a.getpercentage();
      B b= new B(67,45,89,76);
      b.getpercentage();



    }

    }

