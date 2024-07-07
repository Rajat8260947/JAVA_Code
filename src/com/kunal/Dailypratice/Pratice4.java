// super() can be used to invoke immediate parent class instance variable

package com.kunal.Dailypratice;
class Animal2
{
    String Color=" White";

}
class  Dog2 extends  Animal2
{
    String Color=" Black";
    void printColor()
    {
        System.out.println(Color);
        System.out.println(super.Color);
    }
}
public class Pratice4 {
    public static void main(String[] args) {
        Dog2 d2=new Dog2();
        d2.printColor();

    }
}
