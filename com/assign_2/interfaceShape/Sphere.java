package com.assign_2.interfaceShape;

public class Sphere implements Shape {
    public void area() {
        final float pi = 3.14f;
        float r = 8.3f;
        float area = 4 * pi * r * r;
        System.out.println("Area of Sphere = "+ area);
    }
}
