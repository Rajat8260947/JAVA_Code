//package com.kunal.polymorphism;
package com.kunal.polymorphism;

public class Circle extends Shapes{

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
