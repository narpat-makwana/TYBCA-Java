package com.assign_1.number;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        // int x = Integer.parseInt(args[0]);
        MyNumber n1 = new MyNumber(54);
        if(n1.isNegative())
        {
            System.out.println("Number is Negative.");
        }
        if(n1.isPostive())
        {
            System.out.println("Number is Positive.");
        }
        if(n1.isOdd())
        {
            System.out.println("Number is Odd.");
        }
        if(n1.isEven())
        {
            System.out.println("Number is Even.");
        }
        

        
    }
    
}
