package com.tgt.igniteplus;
import java.util.*;
public class firstContainsSecond
{
    public static void main(String[] args)
    {
        int i,j=0,c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        for(i=0;i<s1.length()-1;i++)
        {
            if(s1.charAt(i)==s2.charAt(0))
            {
                for(j= 0;j<s2.length(); j++)
                {
                    if((i + j)<s1.length()&&s2.charAt(j)==s1.charAt(i + j)&&j==s2.length()- 1)
                        c = 1;
                }
            }
        }
        if(c==1)
            System.out.println("Second string is present in first string");
        else
            System.out.println("Second string is not present in first string");

    }
}
