package java_pratice.Absrtract;

abstract class Animal{
      abstract    void cats();
     abstract void dogs();

}
 class Cats extends Animal
{
    void  cats()
    {
        System.out.println(" Cats meow");
    }
    void dogs(){

    }



}
class Dogs extends  Animal
{
    void dogs(){
        System.out.println(" Dogs bark");
    }
    void  cats()
    {

    }

}


public class Abstract5 {
    public static void main(String[] args) {
       Cats C= new Cats();
       C.cats();
       Dogs D=new Dogs();
       D.dogs();


    }
}
