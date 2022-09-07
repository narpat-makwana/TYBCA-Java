//1. Write a Java program to accept a number from command prompt and generate 
//multiplication table of a number.
package com.assign_1.table;
import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to print Table : ");
        int n = in.nextInt();

        for(int i = 1; i<=10; i++)
        {
            System.out.println(n + " x " + i +" = " + n*i);
            // System.out.println();
        }

        in.close();
    }
    
}
