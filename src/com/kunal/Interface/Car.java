package com.kunal.Interface;

public class Car implements  Engine,Break,Media{
  int a =30;
    @Override

    public void brake() {
        System.out.println(" I break like a normal car");

    }

    @Override
    public void start() {
        System.out.println(" i start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println(" i stop engine like a normal car");


    }

    @Override
    public void acc() {
        System.out.println(" i acceelerate engine like a normal car");


    }
}
