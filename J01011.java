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
public class J01011 {
    public static Scanner sc = new Scanner(System.in);
    public static long gcd(long a,long b)
    {
        while(b!=0)
        {
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t>0)
        {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            long c = gcd(a,b);
            System.out.println(a*b/c + " " + c);
            t--;
        }
    }
}
