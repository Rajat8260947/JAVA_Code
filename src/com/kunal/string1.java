package com.kunal;

public class string1 {
    public static void main(String[] args) {
        char [] ch={'a','b','c','d'};
        String s=new String((ch));
        System.out.println(ch[0]);
        ch[0]='b';
        System.out.println(ch);
    }
}
