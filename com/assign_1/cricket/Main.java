package com.assign_1.cricket;
// import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException   
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter How Many Record U want to Enter : ");
        int n = Integer.parseInt(in.readLine());

        CricketPlayer cp[] = new CricketPlayer[n];

        for (int i = 0; i < 2; i++) 
        {
            cp[i] = new CricketPlayer();
            cp[i].get();
        }

        CricketPlayer.avg(n, cp);

        for (int i = 0; i < n; i++) 
        {
            cp[i].get();
        }


    }
}
