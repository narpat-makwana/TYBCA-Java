package com.assign_2.shape;

public class Cylinder extends Shape {
    float r = 6.8f; 
    float h = 11.5f;
    float pi = 3.14f;

    public void area() {
        float area = (2 * pi * r * h) + (2 * pi * r * r);
        System.out.println("Area of Cylinder = " + area);
    }

    public void volume() {
        float vol = pi * r * r * h;
        System.out.println("Volume of Cylinder = "+ vol);
    }
}
