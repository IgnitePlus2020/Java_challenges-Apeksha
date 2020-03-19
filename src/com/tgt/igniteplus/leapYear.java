package com.tgt.igniteplus;
import java.util.*;
public class leapYear
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter year");
        int n=in.nextInt();
        if((n%4==0)&&(n%100!=0)||(n%400==0))
            System.out.println("Leap year");
        else
            System.out.println("Not a Leap year");
    }
}
