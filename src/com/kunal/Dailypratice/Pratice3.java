package com.kunal.Dailypratice;
// super() can be used to invoke immediate parent class constructor
class Animal1
{
    Animal1()
    {
        System.out.println(" animal is crated");
    }


}
class Dog1 extends  Animal1
{
    Dog1()
    {
        super();
        System.out.println(" dog is created");
    }
}
public class Pratice3 {
    public static void main(String[] args) {
        Dog1 d=new Dog1();


    }
}
