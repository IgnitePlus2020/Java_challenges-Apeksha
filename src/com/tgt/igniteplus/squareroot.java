package com.tgt.igniteplus;
import java.util.*;
public class squareroot
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        double n=in.nextDouble();
        double sqr=Math.sqrt(n);
        if(sqr-Math.floor(sqr)==0)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");
    }
}
