package com.tgt.igniteplus;
import java.util.*;
public class replace
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String s=in.nextLine();
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++)
            if(a[i]=='a')
                a[i]='$';
            System.out.println(a);
    }
}
