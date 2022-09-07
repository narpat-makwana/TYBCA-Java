 package com.narpat.Basics;
import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int cnt = 2;

        while (cnt <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            cnt++;
        }
        System.out.println(b);
        in.close();
    }
}