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
public class J02008 {
    public static long GCD(long a,long b)
    {
        while(b!=0)
        {
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    public static long LMC(long a,long b)
    {
        return a*b/GCD(a,b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            long res = 1;
            for(int i= 2;i<=n;i++)
            {
                res = LMC(res,i);
            }
            System.out.println(res);
        }
    }
}
