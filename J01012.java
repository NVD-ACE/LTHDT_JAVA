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
public class J01012 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int dem = 0;
            for(int i=1;i<=sqrt(n);i++)
            {
                if(n%i==0)
                {
                    if(i%2==0)
                    {
                        dem++;
                    }
                    if((n/i)%2==0)
                    {
                        dem++;
                    }
                    if(i*i==n)
                    {
                        dem--;
                    }
                } 
            }
            if(dem>=0)
            {
                System.out.println(dem);
            }
            else
            {
                System.out.println(0);
            }
            t--;
        }
    }
}
