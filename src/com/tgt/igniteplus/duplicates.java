package com.tgt.igniteplus;
import java.util.*;
public class duplicates
{
    public static void main(String[] args)
    {   int j=0,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j]&&a[j]!=' ')
                    c++;
            }
            if(c>0)
                System.out.println("Duplicate Character "+a[i]);
        }
    }
}
