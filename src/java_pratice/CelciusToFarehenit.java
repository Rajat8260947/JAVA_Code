package java_pratice;

import java.util.Scanner;

public class CelciusToFarehenit {
    public static void main(String[] args) {
        double cel;
        Scanner Sc= new Scanner(System.in);
        System.out.println(" enter the farehenit temp :");
        double far = Sc.nextDouble();
        cel=((32-far)*5)/9;
        System.out.println(" the celcius temp is" + cel);

//        System.out.println(" enter the celcius temp ");
//
//        cel=Sc.nextDouble();
//        double far= ((cel)*9/5)+32;
//        System.out.println(" farhenit is : "+ far);




    }
}
