package com.assign_1.employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter How many Details U want to enter : ");
        int n = in.nextInt();
        
        Employee [] emp = new Employee[n];
        
        for (int i = 0; i < n; i++) 
        {
            emp[i] = new Employee();
            emp[i].setdata();    
        }
        System.out.println("Entered details are :..");
        for (int i = 0; i < n; i++) 
        {
            emp[i].getdata();    
        }

        in.close();
    }
}
