package java_pratice.MidTerm;
class shape
{
    void display()

    {
        System.out.println(" inside display");
    }

}

class rectangle extends  shape {
    void area() {
        System.out.println(" inside area");
    }
}
class cube extends  rectangle{
    void volume() {
        System.out.println(" inside volume");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
         cube c= new cube();
         c.volume();
         c.area();
         c.display();

    }

}
