package com.assign_1.product;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter How many details U want to enter : ");
        int n = in.nextInt();

        Product[] p = new Product[n];
        // p[0] = new Product(101,"narpat",899);
        // p[1] = new Product(102,"rohan",699);
        // p[2] = new Product(103,"vishal",499);
        // p[3] = new Product(104,"naresh",999);
        // p[4] = new Product(105,"anuj",799);
        for (int i = 0; i < p.length; i++) 
        {
            p[i] = new Product();
            p[i].setdata();
        }

        for (int i = 0; i < p.length; i++) 
        {
            p[i].getdata();   
        }
        
        in.close();
    }
    
   
} 
    

