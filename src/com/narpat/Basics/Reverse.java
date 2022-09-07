package com.narpat.Basics;
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to reverse : ");
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            sum = (sum * 10) + rem;
        }

        System.out.println("The reverse of number is " + sum);
        
        in.close();
    }
}