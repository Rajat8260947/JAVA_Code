package java_pratice.MidTerm;
 class StaticVariable
{
    static  int price=30;
     int roll= 2102130 ;


}

public class UnitIIQuestion2 {
    public static void main(String[] args) {

        StaticVariable s1 = new StaticVariable();

        System.out.println(" value  of instance variable = " + s1.roll);
        System.out.println(" value of static variable is = " + StaticVariable.price );


    }
}
