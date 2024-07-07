package java_pratice.constructor;
class Student1
{
    int id;
    String name;

    //method to display the value of id and name
    Student1(int i,String n) {
        id = i;
        name = n;
    }
        Student1()
        {

        }

     Student1(Student1 s)
     {
         id=s.id;
         name=s.name;
     }

     void display()
     {
         System.out.println(id+" "+name);
}

}

public class Overloading {
    public static void main(String[] args) {
        Student1 s1 = new Student1(111,"Karan");
        Student1 s2 = new Student1(s1);
//        s2.id=s1.id;
//        s2.name=s1.name;
//
        s1.display();
        s2.display();

    }
}
