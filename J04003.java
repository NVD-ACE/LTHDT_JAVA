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
class PhanSo{
    private long tu, mau;
    public static Scanner sc = new Scanner(System.in);
    public static long Gcd(long a,long b)
    {
        while(b!=0)
        {
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    public PhanSo() {
    }
    

    @Override
    public String toString() {
        return tu/Gcd(tu,mau) + "/" + mau/Gcd(tu,mau);
    }
    public void nhap()
    {
        tu = sc.nextLong();
        mau = sc.nextLong();
    }
} 
public class J04003 {
    public static void main(String[] args)
    {
        PhanSo x = new PhanSo();
        x.nhap();
        System.out.println(x);
    }
}
