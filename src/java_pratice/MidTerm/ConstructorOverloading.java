package java_pratice.MidTerm;
class Student {
    String name;
    int roll;
    float marks;


    public Student() {
        System.out.println(" this " +
                "is default Constructor");

    }

    public  Student ( String name, int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    public  Student ( String name, int roll,float mark)
    {
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    void display()
    {
        System.out.println("Name = "+ name + " roll = " + roll);
        System.out.println("Name = "+ name + " roll = " + roll + " marks " + marks);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student(" Rajat",2102130);
        Student s3 = new Student(" Raj",2102131,521);
        s2.display();
        s3.display();

    }
}
