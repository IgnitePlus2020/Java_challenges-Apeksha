package com.tgt.igniteplus;
import java.util.*;
public class countWords
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=in.nextLine();
        String[] a=s.split("\\ ");
        int l=a.length;
        System.out.println("Number of words: "+l);
    }
}
