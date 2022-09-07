package com.narpat.methods;
import java.util.Arrays;
class VarArgs{
    public static void main(String[] args) {
    // demo(11,22,33,66); 
    // str("Ram","Rohan","Narpat"); 
        multiple(12,32,"Ram","Rohan","Shyam");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void str(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...s)
    {
        System.out.println(Arrays.toString(s));
    }

}
