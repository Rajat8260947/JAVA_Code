import java.util.Scanner;

public class percentage_mark {
    public static void main(String args[]){
//        System.out.println(" enter the mark of 1st subject");

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the mark of 1st subject");
        int mark1 = sc.nextInt();
        System.out.println(" enter the mark of 2st subject");
        int mark2= sc.nextInt();
        System.out.println(" enter the mark of 3rd subject");
        int mark3 = sc.nextInt();
        System.out.println(" enter the mark of 4st subject");
        int mark4 = sc.nextInt();
        System.out.println(" enter the mark of 5st subject");
        int mark5= sc.nextInt();
        float per_mark= (mark1+mark2+mark3+mark4+mark5)/5;
        System.out.println(" the percentage ="+per_mark);
    }
}
