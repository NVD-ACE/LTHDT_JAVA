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
public class J01005 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {
        int t = sc.nextInt();
        while(t>0)
        {
            int n,h;
            n = sc.nextInt();
            h = sc.nextInt();
            for(int i=1;i<n;i++)
            {
                double a = (double)i/n;
                double d = sqrt(a)*h;
                System.out.printf("%.6f ", d);
            }
            System.out.println();
            t--;
        }
    }
}
