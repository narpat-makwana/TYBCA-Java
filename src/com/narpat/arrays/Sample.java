package com.narpat.arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Welcome to the programming in Java...");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many elements U want to enter : ");
        int n = in.nextInt();

        int[] arr1D = new int[n];
        System.out.println("Enter "+ n +" elements : ");
        for (int i = 0; i < n; i++) {
            arr1D[i] = in.nextInt();
        }

        //Display...
        for (int i = 0; i < n; i++) {
            System.out.print(arr1D[i] + " ");
        }

        //2D Arrays:
        System.out.println("Enter the No of Rows : ");
        int r = in.nextInt();
        System.out.println("Enter the No of Columns : ");
        int c = in.nextInt();

        int[][] arr2D = new int[r][c];
        System.out.println("Enter "+ r*c +" elements : ");


        for (int[] arr : arr2D)
        {
            System.out.println(Arrays.toString(arr));
        }

//Array list
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        System.out.println(list);

        list.set(2,99);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        in.close();
    }
}
