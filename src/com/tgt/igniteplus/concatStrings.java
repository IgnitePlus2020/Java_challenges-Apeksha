package com.tgt.igniteplus;
import java.util.*;
public class concatStrings
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two string respectively");
        String s1=in.nextLine();
        String s2=in.nextLine();
        System.out.println(s1.concat(" "+s2));
    }
}
