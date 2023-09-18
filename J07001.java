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
public class J07001 {
    public static void main(String[] args)
    {
        //src/CodePtit/DATA
        try{
            File f = new File("DATA.in");
            Scanner Read = new Scanner(f);
            while(Read.hasNextLine())
            {
                String x = Read.nextLine();
                System.out.println(x);
            }
            Read.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
