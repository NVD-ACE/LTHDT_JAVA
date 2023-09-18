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
public class J01021 {
    public static final long MOD = (int)1e9+7;
    public static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a % MOD;
        }
        long tmp = pow(a, b / 2);
        if (b % 2 == 0) {
            return (tmp * tmp) % MOD;
        }
        return (((tmp * tmp) % MOD) * a) % MOD;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            long a,b;
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0&&b==0)
            {
                break;
            }
            System.out.println(pow(a,b));
        }
    }
}
