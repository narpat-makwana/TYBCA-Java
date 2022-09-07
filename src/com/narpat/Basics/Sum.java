package com.narpat.Basics;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Any Two Number to Add : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        input.close();
        System.out.println("The Sum of Numbers is " + sum);
    }
}
