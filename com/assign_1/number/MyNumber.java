/*9. Define a class MyNumber having one private integer data
member. Write a default constructor initialize it to 0 and
another constructor to initialize it to a value. Write methods
isNegative, isPositive, isOdd, iseven. Use command line
argument to pass a value to the object and perform the above
tests. */
package com.assign_1.number;

public class MyNumber {
    private int num;

    MyNumber()
    {
        num = 0;
    }

    MyNumber(int num)
    {
        this.num = num;
    }

    public boolean isNegative()
    {
        if (num < 0)
        {
            return true;
        }
        else return false;
    }
    public boolean isPostive()
    {
        if (num > 0)
        {
            return true;
        } 
        else return false;           
    }
    public boolean isOdd()
    {
        if (num % 2 != 0)
        {
            return true;
        }
        else return false;
    }
    public boolean isEven()
    {
        if (num % 2 == 0)
        {
            return true;
        }
        else return false;
    }
    

}
