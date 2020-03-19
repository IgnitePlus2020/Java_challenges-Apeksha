package com.tgt.igniteplus;
import java.io.*;
public class copyFile
{
    public static void main(String[] args)
    {
        FileInputStream fin=null;
        FileOutputStream fout=null;

        try{
            File f1 =new File("C:\\Users\\apeks\\Documents\\java prac\\java.txt");
            File f2=new File("C:\\Users\\apeks\\Documents\\java prac\\java1.txt");
            if(!f2.exists())        //creating file if doesn't exist
                f2.createNewFile();
            fin=new FileInputStream(f1);
            fout=new FileOutputStream(f2);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fin.read(buffer)) > 0)
            {
                fout.write(buffer, 0, length);
            }
            fin.close();       //Closing the fin/fout file streams
            fout.close();
            System.out.println("File copied successfully!!");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
