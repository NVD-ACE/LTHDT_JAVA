/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;
/**
 *
 * @author dungn
 */
public class J07002 {
    public static void main(String[] args)
    {
        try{
            File f = new File("src/CodePtit/DATA");
            Scanner ReadFile = new Scanner(f);
            long sum = 0;
            while(ReadFile.hasNext())
            {
                String x = ReadFile.next();
                try{
                    long n = Long.parseLong(x);
                    sum += n;
                }catch(Exception e)
                {
                }
            }
            System.out.println(sum);
            ReadFile.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
