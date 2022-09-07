package com.narpat.Basics;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 Numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a>b && a>c)
        {
            System.out.println(a + " is Greater");
        }
        else if(b>a && b>c)
        {
            System.out.println(b + " is Greater");
        }
        else{
            System.out.println(c + " is Greater");
        }
            in.close();
    }
}
