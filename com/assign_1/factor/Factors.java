// 2. Write a Java program to print the factors of a number.
package com.assign_1.factor;
import java.util.*;
public class Factors {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to print Factors : ");
        int n = in.nextInt();
        
        System.out.println("The factors of "+n+" = ");
        for (int i = 1; i <= n; i++) 
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");  
            }    
                in.close();         
        }
    }
}
