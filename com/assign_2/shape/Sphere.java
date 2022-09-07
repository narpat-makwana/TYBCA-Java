package com.assign_2.shape;

public class Sphere extends Shape {
    float r = 9.8f;
    float pi = 3.14f;

    public void area() {
        float area = 4 * pi * r * r;
        System.out.println("Area of Sphere = " + area);
    }

    public void volume() {
        float vol = (4 / 3) * pi * r * r * r;
        System.out.println("Volume of Sphere = "+ vol);
    }

}
