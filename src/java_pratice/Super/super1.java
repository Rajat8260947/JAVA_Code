package java_pratice.Super;
class Animal
{
    String color="white";

}
class Dog extends  Animal
{
    String color= "Black";
void printcolor()
{
    System.out.println(color);
    System.out.println(super.color);
}
}
public class super1 {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.printcolor();
    }
}
