/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author dungn
 */

public class J01004 {
    public static int snt(int n)
    {
        for(int i=2;i<=sqrt(n);i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            if(snt(n)==1)
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
            t--;
        }
    }
}
