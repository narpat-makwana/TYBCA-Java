package com.assign_2.interfaceShape;

// import java.util.Scanner;

public class Circle implements Shape {
    public void area() {
        final float pi = 3.14f;
        float r = 3.9f;
        float area = pi * r * r;
        System.out.println("Area of Circle = "+ area);
    }
}
