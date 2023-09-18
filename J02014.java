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
public class J02014 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int sum =0;
            int []a = new int[n];
            int []f = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                sum +=a[i];
                if(i==0)
                {
                    f[i] =a[i];
                }
                else
                {
                    f[i] = f[i-1] + a[i];
                }
            }
            int ok = 0;
            for(int i=1;i<n;i++)
            {
                if(sum-f[i]==f[i-1])
                {
                    System.out.println(i+1);
                    ok = 1;
                    break;
                }
            }
            if(ok==0)
            {
                System.out.println(-1);
            }
        }
    }
}
