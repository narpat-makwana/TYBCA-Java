package com.assign_2.employee;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the No of record : ");
        // int n = in.nextInt();
        Employee e1 = new Employee();
        Worker w1 = new Worker();
        e1.accept();
        
        w1.accept();
        w1.display();
        w1.maxTotalSal();

        

        in.close();


        

    }
    
}
