package java_pratice.MidTerm;

class student  {
    String name;
    int roll;
    int mark;

    void getstudent(String n,int r,int m)
    {
        name=n;
        roll=r;
        mark=m;


    }
    void showstudent(){

        System.out.println(" the name of the studnet is ....."+name);
        System.out.println(" the roll of the studnet is ....."+roll);
        System.out.println(" the mark of the studnet is ....."+mark);



    }
}


   public class  Student1 {
    public static void main(String[] args) {
        student S1 = new student();

        S1.getstudent(" rajat", 2102130, 54);
        S1.showstudent();
        student S2 = new student();

        S2.getstudent(" raj", 2102133, 74);
        S2.showstudent();
        student S3 = new student();

        S3.getstudent(" raghav", 2102131, 64);
        S3.showstudent();
        System.out.println(" the avg mark is");
        System.out.println(summark(S1.mark,S2.mark,S3.mark));


    }

    static  int  summark(  int m1,int m2,int m3)
    {
//        System.out.println(" Sum of mark of three student is "+ m1+m2+m3);
        return m1+m2+m3;
    }

}