package com.assign_2.vehicle;
import java.util.Scanner;
public class HeavyMotorVehicle extends Vehicle
{
    float capacity_in_tons;

    public void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Capacity in Tons : ");
        capacity_in_tons = in.nextFloat();
        in.close();
    }

    public void display()
    {
        System.out.println("Capacity In Tons : "+ capacity_in_tons);
    }
}