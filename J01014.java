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
public class J01014 {
    public static Scanner sc = new Scanner(System.in);
    public static int snt(long n)
    {
        if(n<2)
        {
            return 0;
        }
        for(int i=2;i<=sqrt(n);i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t>0)
        {
            long n = sc.nextLong();
            int ok = 0;
            long tmp = 0;
            for(int i=1;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    if(snt(n/i)==1)
                    {
                        ok = 1;
                        System.out.println(n/i);
                        break;
                    }
                    if(snt(i)==1)
                    {
                       tmp = i;
                    }
                }
            }
            if(ok==0)
            {
                System.out.println(tmp);
            }
            t = t-1;
        }
    }
}
