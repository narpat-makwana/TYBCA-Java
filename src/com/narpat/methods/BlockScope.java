package com.narpat.methods;
// import java.util.Scanner;
public class BlockScope 
{
    public static void main(String[] args) {
        int a = 10;
        // int b = 20;
        String name = "Kunal";

        {
            // int a = 15;
            System.out.println(a);
            a = 15;
            // int c = 100;
            System.out.println(a);
            name = "Rohan";
            System.out.println(name);
        }
    //    c = 200;  ->Not allowed
    // int c;       ->Allowed

    }

}
