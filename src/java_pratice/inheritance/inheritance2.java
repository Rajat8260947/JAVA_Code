package java_pratice.inheritance;

class Animal
{
     void food(){
         System.out.println(" what kind of  food do loins eat");
     }
}
class Lion extends Animal
{

    void food(int x) {
        System.out.println(" Lions eat flesh ");

    }
}

public class inheritance2 extends  Lion {
    public static void main(String[] args) {
        Animal a= new Lion();
        a.food();
        Lion L= new Lion();
        L.food();
        L.food(29);

    }
}
