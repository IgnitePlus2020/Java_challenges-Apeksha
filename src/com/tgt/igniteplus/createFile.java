package com.tgt.igniteplus;
import java.io.*;
import java.io.IOException;
public class createFile
{
    public static void main(String[] args)
    {
        try
        {
            File jv1=new File("C:\\Users\\apeks\\Documents\\java prac\\java.txt");
            if(jv1.createNewFile())
            System.out.println("File created: " + jv1.getName());
            else
            System.out.println("File already exists.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
        }
    }
}
