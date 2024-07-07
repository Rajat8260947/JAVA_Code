package com.kunal.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power engine is start");
    }

    @Override
    public void stop() {
        System.out.println("power engine is stop");

    }

    @Override
    public void acc() {
        System.out.println("power engine is accelerate");

    }
}
