package com.kunal.staticExample;

public class staticBlock {


    static int a = 4;
    static int b ;
     static {
         System.out.println(" I am static Block");
          b=a*5;

     }

    public static void main(String[] args) {
        staticBlock obj1 = new staticBlock();
        System.out.println(staticBlock.a   +" "+ staticBlock.b);
        staticBlock.b+=3;
        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a   +" "+ staticBlock.b);
        staticBlock obj3 = new staticBlock();
        System.out.println(staticBlock.a   +" "+ staticBlock.b);
    }

}
