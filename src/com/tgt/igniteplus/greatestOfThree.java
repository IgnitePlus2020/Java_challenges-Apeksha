package com.tgt.igniteplus;
import java.util.*;
public class greatestOfThree
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double h=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("Highest:"+h);
    }
}
