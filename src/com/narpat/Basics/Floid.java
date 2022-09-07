package com.narpat.Basics;
import java.util.Scanner;
public class Floid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int r = in.nextInt();

        System.out.println("Enter the no of rows : ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(n + " ");
                n++;
            }   
            System.out.println("\n");
        }
        in.close();
    }
}
