 package com.narpat.arrays;
import java.util.Arrays;
public class PassingFunc 
{
    public static void main(String[] args) 
    {
         int arr[] = {11,22,33,55,44,66,99,8,87,7}; 
         System.out.println(Arrays.toString(arr));

         change(arr);
         System.out.println(Arrays.toString(arr));

    }

    static void change(int arr[])
    {
        arr[1] = 109;
    }
}
