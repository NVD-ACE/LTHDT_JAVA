/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.StringIndexOutOfBoundsException;
/**
 *
 * @author dungn
 */
public class J07021 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner Read_File = new Scanner(new File("src/CodePtit/DATA"));
        while(Read_File.hasNextLine())
        {
            String x = Read_File.nextLine().trim();
            if(x.equals("END")){
                break;
            }
            String []str = x.trim().split("\\s+");
            for(String word: str)
            {
                try{
                    System.out.print(word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase()+" ");
                }catch(StringIndexOutOfBoundsException e)
                {
                    System.out.println();
                }
            }
            System.out.println();
        }
        Read_File.close();
    }
}
