package com.tgt.igniteplus;
import java.util.*;
public class uglyNumber
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = in.nextInt();
        int c = ugly(n);
        if (c == 1)
            System.out.println("Ugly number");
        else
            System.out.println("Not an ugly number");
    }
    static int maxDivide(int a, int b)
    {
        while(a % b == 0)
            a = a/b;
        return a;
    }
    static int ugly(int no)
    {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);
        return (no == 1)? 1 : 0;
    }

}
