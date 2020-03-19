package com.tgt.igniteplus;
import java.util.*;
public class discount
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the price");
        double ap=in.nextDouble();
        double dis=ap*(12.0/100);
        double sp=ap-dis;
        System.out.println("Selling price:"+sp+"\nDiscount given: "+dis);
    }
}
