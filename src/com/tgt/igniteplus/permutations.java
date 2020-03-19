package com.tgt.igniteplus;
import java.util.*;
public class permutations
{
    public static void main(String[] args)
    {
        int start = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        int len = s.length();
        permute(s, 0, len);
    }
    public static void permute(String s,int start,int end)
    {
        if(start==s.length()-1)
            System.out.println(s);
        else
        {
            for(int i=start;i<end;i++)
            {
                s=swapString(s,start,i);
                permute(s,start+1,end);
                s=swapString(s,start,i);

            }
        }
    }
    public static String swapString(String s,int i,int j)
    {
        char[] b=s.toCharArray();
        char c;
        c=b[i];
        b[i]=b[j];
        b[j]=c;
        return String.valueOf(b);

    }
}
