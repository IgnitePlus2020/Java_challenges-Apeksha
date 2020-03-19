package com.tgt.igniteplus;
import java.io.*;
import java.util.*;
public class writeIntoFile
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        try
        {
            File fw=new File("C:\\Users\\apeks\\Documents\\java prac\\java.txt");
            FileOutputStream fout = new FileOutputStream(fw);
            if(!fw.exists())    //creating file if doesn't exist
                fw.createNewFile();
            System.out.println("Write the content");
            String s=in.nextLine();
            byte[] bString=s.getBytes();
            fout.write(bString);
            fout.flush();
            System.out.println("File written successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
