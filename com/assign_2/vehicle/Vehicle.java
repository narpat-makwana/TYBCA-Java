/*1. Write a Java program to create a super class Vehicle having
members Company and Price. Derive two different classes
LightMotorVehicle (mileage) and HeavyMotorVehicle
(capacity_in_tons). Accept the information for “n” vehicles
and display the information in appropriate form. While taking
data, ask user about the type of vehicle first. */
package com.assign_2.vehicle;

import java.util.Scanner;

public class Vehicle {
    String company;
    int price;

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Company : ");
        company = in.next();
        System.out.println("Enter Price : ");
        price = in.nextInt();
        in.close();
    }

    public void display() {
        System.out.println("\nCompany : " + company + "\nPrice : " + price);
    }
}
