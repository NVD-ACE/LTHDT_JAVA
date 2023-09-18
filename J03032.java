/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author dungn
 */
public class J03032 {
    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       //int t = Integer.parseInt(sc.nextLine());
       int t = sc.nextInt();
       sc.nextLine();
       while(t-->0)
       {
           String s = sc.nextLine();
           //ArrayList<String> a = new ArrayList<String>();
           String [] words = s.trim().split("\\s+");
           for(String i:words)
           {
               i = new StringBuilder(i).reverse().toString();
               System.out.print(i +" ");
           }
           System.out.println();
       }
   }
}
