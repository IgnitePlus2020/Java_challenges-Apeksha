package com.tgt.igniteplus;
import java.util.*;
public class averageOfArray
{
    public static void main(String[] args)
    {   double sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n=in.nextInt();
        double a[]=new double[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextDouble();
            sum = sum + a[i];
        }
        System.out.println("Average of array elements is:"+(sum/n));
    }
}
