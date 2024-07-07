package java_pratice.MidTerm;
class  InstanceVariable {
    private int id;
    private String name;
    private double price;


    public InstanceVariable( int id,String name,double price)
    {
        this.id=id;
        this.name=name;
        this.price=price;

    }

    void display()
    {
        System.out.println("Id="+ id);
        System.out.println("name="+ name);
        System.out.println("price="+ price);
    }


}
public class UnitIIQuestion1 {
    public static void main(String[] args)
    {
        InstanceVariable d1 = new InstanceVariable(2102130,"Rajat",555.45);
        InstanceVariable d2 = new InstanceVariable(2102134,"Ravikant",565.45);
        d1.display();
        d2.display();

    }
}
