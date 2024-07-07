// package com.kunal.String;
//    STRING METHOD
//    1.equals()
//    2.equalsIgnoreCase
//    3.compareTo
//    4.ToUpperCase
//    5.ToLowerCase
//    6.charAt()
//    7.String substring()
//    8.concat()
//    9.join()
//    10.trim()
//    11.statsWith()
//    12.endsWith()
//     13.length()
//     14.valueOf()
//    15. replace()
//    16. replaceAll()
//     17.contains()
public class StringMethod {
    public static void main(String[] args) {
//         equals()
//        String s1="Sachin";
//        String s2="Sachin";
//        String s3=new String("Sachin");
//        String s4="Saurav";

//
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1.equals(s3));//true
//        System.out.println(s1.equals(s4));//false
//        System.out.println(s1==s3);//false

//          equalsIgnoreCase
//        String s1="Sachin";
//        String s2="SACHIN";
//        System.out.println(s1.equals(s2));//false
//        System.out.println(s1.equalsIgnoreCase(s2));//true


//        String  compareTo()
        String s1="Sachin";
        String s2="Sachin";
        String s3="AtanTata";

    //    System.out.println(s1.compareTo(s2));//0
    //     System.out.println(s1.compareTo(s3));//1(because s1>s3)
    //     System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )

//         String  toUpperCase()
//         System.out.println(s1.toUpperCase());

//         String  toLowerCase*()
//        System.out.println(s2.toLowerCase());

//          String charAt()
//        System.out.println(s1.charAt(5));

//        String substring()
       System.out.println(s3.substring(5));
       System.out.println(s3.substring(5,7));

//        String concat()
//        System.out.println(s1.concat(s3));

//        String join()
//        System.out.println(s3.join("-","java","point","Tutorial"));


////        string trim()
//        String s="  Sachin  ";
//        System.out.println(s);//  Sachin
//        System.out.println(s.trim());//Sachin

//        statsWith() & endsWith()
//        String s="Sachin Tendulkar";
//        System.out.println(s. startsWith("Sachin"));//true
//        System.out.println(s.endsWith("ka"));//true

//         String length()
//        String s= " Rajat Kumar Sahoo";
//        System.out.println(s.length());

//        String valueOf()
//            int a=10;
//            String s=String.valueOf(a);
//            System.out.println(s+10);
//
//        string replace()
//        String name = " java concept";
//        System.out.println(name.replace('j','r'));
//        System.out.println(name.replace("java", "python"));

//        String replaceAll();
//        String s1="java  point is a very good website";
//        String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
//        System.out.println(replaceString);

////     contains()
//        String name = " Java concept of   the day";
//        boolean s= name.contains("concept of");
//        System.out.println(s);
//        System.out.println(name.contains("java"));// case sensitive


    }

}