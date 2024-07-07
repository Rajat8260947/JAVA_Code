package com.kunal.Dailypratice;
//constructor overloading ;

class Student
{
    String  name;
    int roll;


    Student(String n,int r)
    {
        name=n;
        roll=r;

    }
    Student(Student R)
    {
        name=R.name;
        roll=R.roll;

    }
    void display()
    {
        System.out.println(roll+" "+name);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student S1= new Student("rajat",2102130);
        Student S2 = new Student(S1);
        S1.display();
        S2.display();




    }
}
