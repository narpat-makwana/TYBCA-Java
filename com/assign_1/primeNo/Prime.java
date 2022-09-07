// Write a Java program to accept a number from user and print all prime numbers 
//upto that number(Use Buffered Reader class):

package com.assign_1.primeNo;
// import java.io.*;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Prime 
{
    public static void main(String[] args) throws IOException
    {    
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter the Number to check : ");
        int num = br.read();
        
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) 
        {
            if (num % i == 0) 
            {
                flag = true;
                break;
            }
        }

        if (!flag)
        {
        System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
    
        }

    }
}
