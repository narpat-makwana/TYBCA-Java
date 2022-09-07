package com.narpat.arrays;
import java.util.Scanner;
// import java.util.Arrays;        
public class Array2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // System.out.println("How many elements U want to enter in Array : ");
        // int n = in.nextInt();

        // int[] arr1 = new int[n];

        // System.out.println("Enter the "+ n +" elemnts : ");
        // for (int i = 0; i < arr1.length; i++) 
        // {
        //     arr1[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr1));

        //2D Arrays in JAVA...
        System.out.println("Enter No of Rows : ");
        int r = in.nextInt();
        System.out.println("Enter No of Columns : ");
        int c = in.nextInt();

        int[][] arr2D = new int[r][c];

        //Accept Array:
        System.out.println("Enter the " + r * c + " numbers : ");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = in.nextInt();
            }
        }
        System.out.println();

        //Array Display :
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
