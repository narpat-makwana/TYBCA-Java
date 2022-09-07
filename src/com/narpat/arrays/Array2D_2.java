package com.narpat.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Array2D_2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        // int[][] arr2D = {
        //     {1,2},
        //     {11,22,33},
        //     {1,44,77,88}
        // };

        // for (int i = 0; i < arr2D.length; i++) {
        //     for (int j = 0; j < arr2D[i].length; j++) {
        //         System.out.print(arr2D[i][j] + " ");                
        //     }
        //     System.out.println();
        // }

        //2D array display in different ways :
        System.out.println("Enter the No of Rows : ");
        int r = in.nextInt(); 
        System.out.println("Enter the No of Columns : ");
        int c = in.nextInt(); 
        int[][] array2D = new int[r][c];
        
        System.out.println("Enter the "+ r*c +" Elements : ");
        
        for ( int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = in.nextInt();
            }
        }
        System.out.println();

        // for (int i = 0; i < array2D.length; i++) {
        //     System.out.println(Arrays.toString(array2D[i]));  
        // }
        
        for(int[] arr : array2D)
        {
            System.out.println(Arrays.toString(arr));
        }

        in.close();
    }
}
