 package com.narpat.Basics;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args)
    {
        System.out.println("Hello World!...");
        Scanner input = new Scanner(System.in);
        // System.out.print("Plz Enter the input : ");
        // int rollno = input.nextInt();
        // System.out.println("Your roll no is " + rollno);

        String name = input.nextLine();
        System.out.println(name);

        float no = input.nextFloat();
        System.out.println("Your Number is : " + no);
        input.close();

    }
}