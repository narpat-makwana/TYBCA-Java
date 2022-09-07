package com.narpat.methods;
public class Shadowing
{
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        // System.out.println(x);
        x = 40;
        System.out.println(x);
        func1();
    }   
    
    static void func1()
    {
        System.out.println(x);
    }
}
