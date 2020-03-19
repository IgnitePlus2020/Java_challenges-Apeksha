package com.tgt.igniteplus;
import java.util.*;
public class volumeOfCylinder
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder respectively");
        double r=in.nextDouble();
        double h=in.nextDouble();
        double v=3.142*r*r*h;
        System.out.println("Volume of the cylinder is "+v);
    }
}
