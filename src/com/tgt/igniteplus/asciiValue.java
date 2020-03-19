package com.tgt.igniteplus;
import java.util.*;
public class asciiValue
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the character");
        char c=in.next().charAt(0);
        int ascii=(int)c;
        System.out.println("ASCII Value: "+ascii);
    }
}
