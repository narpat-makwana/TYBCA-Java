package com.narpat.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays1D 
{
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 10 element : ");

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();
        }

        // System.out.println("Entered array elements are : ");
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println(Arrays.toString(arr));

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        // System.out.println(arr[10]);   out of bound error!...

        String[] str = new String[5];

        System.out.println("Enter 5 strings : ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        // for (int i = 0; i < str.length; i++) {
        //     System.out.print(str[i] + " ");
        // }


        System.out.println(Arrays.toString(str));
        in.close();
    }
}
