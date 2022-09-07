package com.narpat.Basics;
import java.util.Scanner;
public class Palind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to check : ");
        int n = in.nextInt();
        int temp = n;
        int r, sum = 0;
        while (n > 0) 
        {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) 
        {
            System.out.println("The number is palindrome...");
        } 
        else 
        {
            System.out.println("The number is not an palindrome..");
        }

        in.close();
    }

}
