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
public class J01007 {
    public static Scanner sc = new Scanner(System.in);
    public static long a[]  =  new long[100];
    public static void FiBo()
    {
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for(int i = 3;i<=92;i++)
            a[i]=a[i-1]+a[i-2];
    }
    public static void main(String[] args)
    {
        int t;
        t = sc.nextInt();
        FiBo();
        while(t>0)
        {
            long n;
            n = sc.nextLong();
            int check = 0;
            for(int i=0;i<=92;i++)
            {
                if(a[i]==n)
                {
                    check = 1;
                    System.out.println("YES");
                    break;
                }
            }
            if(check == 0)
            {
                System.out.println("NO");
            }
            t--;
        }
    }
}
