package java_pratice.pw_skill;

public class Lect3 {
    public static void main(String[] args) {
//
////        increment and decrement operator
//
//
////        int x= 10;
////       int y =  x++;
////        System.out.println(x);
////        System.out.println(y);
//
////        int x= 4;
////         y= ++4;// Ce : Increment can be applied on variables not on direct  literals and expression
//         //  y =++(++x)//  expression
//
////          int x =4;
////          ++x;
////          System.out.println(x);
//
////          what is the difference b/w b++ amd b=b+1
//
////
////        byte b=5;
//////        b++; // (byte)(b+1)
////        //b=b+1;
////        System.out.println(b);
////        boolean c = true ;
//       // c++; compile time eror;
//        // doubt
////        int a =100;
////        System.out.println(-a++ + 10);
////        System.out.println(a); // vvi
//
//
//     int i =5;
//     if(i++ <6){
//         System.out.println(i++);
//
//
//
//     }

//         String Concatination

//        String a= "sachin";
//        int b=10, c=20, d=30;
//        System.out.println(a+b+c+d); //sachin102030
//        System.out.println(b+c+d+a); //60sachin
//        System.out.println(b+c+a+d); //30sachin30
//        System.out.println(b+a+c+d);  //10sachin2030
//       a=b+c+d; CE error


//        Relationala Operator

//        System.out.println("sachin" < "kohl");  // CE error
//        System.out.println(true<true); //CE
//        System.out.println(10<10.5); // true
//        nesting of  relational operator is not possible.
//        System.out.println(10<20<30);

//

//      Equlaity operator

//        System.out.println(false== false); // true
//        System.out.println('a'== 97);  // true
//        Thread t1  = new Thread();
//        Thread t2 = new Thread();
//        Thread t3 = t1;
//        System.out.println(t1 == t2); // false
//        System.out.println(t1 == t3); // true

//        Thread t = new Thread();
//
//        Object O  = new Object();
//
//        String s = new String();
//        System.out.println(t == O); //false
//        System.out.println(O == s); // false
//        System.out.println(s == t);  // CE
//        String name = new String("sachin");
//        System.out.println(name == null);// false
//        System.out.println(null == null); // true

//        bitwise operator
//        & (if both argumnets are true ,then result is true)
//        |
//        ^ ( if both are differnet argumnets , then result is true otherwise  it is false )
//        System.out.println(4&5); // 4
//        System.out.println(4|5);  // 5
//        System.out.println(4^5);  // 1
//        System.out.println(~-10); // 2s complement of 4

        // Short circuit operator

            // && , || => Aplicable for boolena type

//        int x =10 , y =15;
//        if(++x<10 | ++y>15){
//            x++; //x==12
//        }
//        else {
//            y++;
//        }
//        System.out.println(x);// x=12
//        System.out.println(y);//y=16


//          boolean b1 = true ;
//          boolean b2 = false;
//        System.out.println(!false ^ false); //true
//        System.out.print(" " +(!b1 & (b2 = true)));// false
//        System.out.println(" " + (b2 ^ b1)); // false
//        Integer x = 0;
//        Integer y = 0;
//        for(Short z = 0; z < 5; z++)
//            if((++x > 2) || (++y > 2))
//                x++;
//
//        System.out.println(x + " " + y); // 8 2
//        int mask = 0;
//         int count = 0;
//         if( ((5<7) || (++count < 10)) | mask++ < 10 ) mask = mask + 1;
//
//         if( (6 > 8) ^ false) mask = mask + 10;
//         if(!(mask > 1) && ++count > 1) mask = mask + 100;
//           System.out.println(mask + " " + count); //  2 0

//        int a = 7;
//        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
//        System.out.println("a = " + a); // 9
//        System.out.println("res = " + res); // true
//        String s = "";
//        Boolean b1 = true;
//        boolean b2 = false;
//        if((b2 = false) | (21%5) > 2) s += "x";
//        if(b1 || (b2 == true)) s += "y";
//        if(b2 == true) s += "z";
//        System.out.println(s); // y


        // conditional Operator
        // Ternary Opearrtor  ?:

//        int x = (10>20)? 30:40;
//        System.out.println(x); //40

//         eg::
//     int x = (10>20)? 30 : (100>20)? 40 :50;
//        System.out.println(x);  // 40



        int  a=10 , b =20;
        byte c1 = (10>20) ? 30: 40;
        byte c2 = (10<20) ? 30: 40;
        System.out.println(c1);
        System.out.println(c2);

    }
}
