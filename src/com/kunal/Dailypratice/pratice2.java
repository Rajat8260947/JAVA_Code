package com.kunal.Dailypratice;
// supper  can be used to invoke parent class method
class Animal
{
    void eat()
        {
    System.out.println(" eating");
}
}
 class Dog extends  Animal
 {
     @Override
     void eat() {
         System.out.println(" eating Bread");
         super.eat();
     }
     void bark() {
         System.out.println(" Barking");
     }
     void work()
     {
//         super.eat();
     }
 }
public class pratice2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}
