package com.kunal.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj=new A(20,"kunal");

        ArrayList<Integer> list= new ArrayList<>();
        obj.setNum(56);
        System.out.println(obj.getNum());


    }
}
