//6. Write a Java Program which define class Product with data member as id, name 
//and price Store the information of 5 products and Display the name of product having minimum
//price(Use array of object).

package com.assign_1.product;
import java.util.*;

    public class Product {
        int id;
        String name;
        int price;
        // Product(int id, String name, int price)
        // {
        //     this.id = id;
        //     this.name = name;
        //     this.price = price;
        // }
    
            public void setdata()
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the id : ");
                id = in.nextInt();
                System.out.println("Enter the name : ");
                name = in.next();
                System.out.println("Enter price : ");
                price = in.nextInt();
                in.close();
            }
            public void getdata()
            {
                System.out.println("ID : " + id);        
                System.out.println("Name : " + name);        
                System.out.println("Price : " + price);        
                System.out.println();
            }
}



