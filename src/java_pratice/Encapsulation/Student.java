package java_pratice.Encapsulation;
class Test9
{
    private String Name;
    public String getName()
    {
        return Name;
    }
     void setName(String Name)
{
    this.Name=Name;

}
}

public class Student {
    public static void main(String[] args) {
        Test9 obj2 = new Test9();
        obj2.setName("Rajata");
        System.out.println(obj2.getName());


    }


}
