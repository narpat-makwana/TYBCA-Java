/*10. Define a class CricketPlayer(name, no_of_innings,
no_of_times_notout, total_runs, bat_avg). Create an array of
“n” player objects. Calculate the batting average for each
player using a static method avg (). Handle appropriate
exception while calculating average. Define static method
“sortPlayer” which sort the array on the basis of average.
Display the player details in sorted order. */
package com.assign_1.cricket;
import java.io.*;
public class CricketPlayer {
    String name;
    int innings, no_of_times_notout, total_runs;
    float bat_avg;

    CricketPlayer()
    {
        name = null;
        innings = 0;
        no_of_times_notout = 0;
        total_runs = 0;
        bat_avg = 0;
    }

    public void get() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the name : ");
        name = br.readLine();
        System.out.println("Enter the No of Innings : ");
        innings = Integer.parseInt(br.readLine());
        System.out.println("Enter the No of times Not Out : ");
        no_of_times_notout = Integer.parseInt(br.readLine());
        System.out.println("Enter the Total Runs : ");
        total_runs = Integer.parseInt(br.readLine());
    }

    public void put()
    {
        System.out.println("Name = "+name);
        System.out.println("No of innings = " + innings);
        System.out.println("No times notout = " + no_of_times_notout);
        System.out.println("Total runs = " + total_runs);
        System.out.println("Batting average = " + bat_avg);
    }
    
    static void avg(int n, CricketPlayer cp[])
    {
        try {
            for (int i = 0; i < n; i++) {
                cp[i].bat_avg = cp[i].total_runs / cp[i].innings;
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid arg");
        }
    }

    static void sort(int n, CricketPlayer cp[])
    {

    }

}
