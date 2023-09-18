/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author dungn
 */
public class J07004 {
    public static void main(String[] args)
    {
        try{
            File f = new File("src/CodePtit/DATA");
            Scanner ReadFile = new Scanner(f);
            //Integer[] a = new Integer[100000];
            int [] d = new int[100005];
            while(ReadFile.hasNext())
            {
                int x = ReadFile.nextInt();
                d[x]++;
            }
            for(int i =0;i<1005;i++)
            {
                if(d[i]!=0)
                {
                    System.out.println(i + " " + d[i] );
                }
            }
            ReadFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
