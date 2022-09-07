package com.narpat.arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ArraysList 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(10);
        list.add(20);
        list.add(30); 
        list.add(40);
        list.add(50);
        list.add(60);
    
        
        // ArrayList<Integer> list2 = new ArrayList<>(5);
        // System.out.println("Enter 5 element : ");
        // for (int i = 0; i < 5; i++) 
        // {
        //     list2.add(i);
        // }
        // System.out.print(list2);

        System.out.println(list);
        System.out.println(list.contains(68)); //returns the boolean value..
        list.set(2, 89);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        for (int i = 0; i < 6; i++) 
        {
            System.out.println(list.get(i));    
        }
        System.out.println(list);
        in.close();
    }    
}

