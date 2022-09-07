package com.assign_2.vehicle;

public class Main 
{
    public static void main(String[] args) 
    {
        LightMotorVehicle [] lmv = new LightMotorVehicle[5];
        HeavyMotorVehicle [] hmv = new HeavyMotorVehicle[5];
        
        System.out.println("Enter Details of LMV : ");
        for (int i = 0; i < 5; i++) 
        {
            lmv[i] = new LightMotorVehicle();
            lmv[i].accept();
        }

        System.out.println("Enter Details of HMV : ");
        for (int i = 0; i < 5; i++) 
        {
            hmv[i] = new HeavyMotorVehicle();
            hmv[i].accept();
        }

        System.out.println("Details of LMV are : ");
        for (int i = 0; i < 5; i++) 
        {
            lmv[i].display();
        }

        System.out.println("Enter Details of HMV : ");
        for (int i = 0; i < 5; i++) 
        {
            hmv[i].display();
        }

    }
}
