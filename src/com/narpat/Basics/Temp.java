package com.narpat.Basics;
import java.util.Scanner;
public class Temp {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Temperature in Degree : ");
        float n = in.nextFloat();
        float r =  (n * 9/5) + 32; 
        System.out.println("The temperature in Farenheight : " + r);
        in.close();
    }
}
