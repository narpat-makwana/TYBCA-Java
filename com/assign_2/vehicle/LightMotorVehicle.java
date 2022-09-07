package com.assign_2.vehicle;
import java.util.Scanner;
public class LightMotorVehicle extends Vehicle{
    float mileage;
    
    public void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Mileage : ");
        mileage = in.nextFloat();
        in.close();
    }
    
    public void display()
    {
        System.out.println("Mileage : "+ mileage);
    }

}
