package com.narpat.methods;
import java.util.Scanner;
public class StringsEx 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = in.next();
        System.out.println("My Name is " + name);
        String str = greet();
        System.out.println(str);
        
        
        String naam = "Narpat";
        String call = greeting(naam);
        System.out.println(call);

        in.close();
    }

    static String greet()
    {
        String greet = "How are You...";
        return greet;
    }

    static String greeting(String name)
    {
        String msg = "Hello " + name;
        return msg;
    }
}
