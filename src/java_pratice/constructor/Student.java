package java_pratice.constructor;

//
public class Student{
    int id;
    String name;

    //method to display the value of id and name
     Student(int i,String n){
         id=i;
         name=n;
     }
    void display()
    {
        System.out.println(id+" "+name);
    }


    public static void main(String args[]){
//creating objects
        Student s1=new Student(22134,"rajat");
        Student s2=new Student(2102130," sahoo");
//displaying values of the object
        s1.display();
        s2.display();
    }
}
