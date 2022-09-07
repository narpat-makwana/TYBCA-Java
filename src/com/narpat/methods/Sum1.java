package com.narpat.methods;
import java.util.Scanner;
public class Sum1 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter two numbers : ");
        // sum(); 
        sum(12,23);
        
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        sum = a + b;
        int mult = a * b;

        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + mult);
        in.close();
    }
    static void sum(int a, int b) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        System.out.println("Sum : " + sum);        
        in.close();
    }
}
