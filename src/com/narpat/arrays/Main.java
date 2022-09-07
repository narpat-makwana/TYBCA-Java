package com.narpat.arrays;
import java.util.Arrays;
public class Main 
{
     public static void main(String[] args) 
     {
        int arr[] = {11,22,33,44,55,66,77,88};
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
     }   
}
