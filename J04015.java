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
class GV{
    public static Scanner sc = new Scanner(System.in);
    private String ma;
    private long phucap;
    private String name;
    private long luong;

    public GV() {
    }
    public void nhap()
    {
        ma = sc.nextLine();
        name = sc.nextLine();
        luong = sc.nextLong();
    }

    public String getMa() {
        return ma;
    }
    public long cb()
    {
        String a = ma.substring(2);
        long x = Long.parseLong(a);
        return x;
    }
    
    public String thunhap()
    {
        long tn = luong*cb();
        String check = ma.substring(0, 2);
        if (check.equals("HT"))
        {
            tn += 2000000;
            phucap = 2000000;
        }
        if(check.equals("HP"))
        {
            tn += 900000;
            phucap = 900000;
        }
        if(check.equals("GV"))
        {
            tn += 500000;
            phucap = 500000;
        }
        return phucap + " " + tn;
    }
    @Override
    public String toString() {
        return ma + " "+ name + " " + cb() + " "+ thunhap();
    }
}
public class J04015 {
    public static void main(String[] args)
    {
        GV x = new GV();
        x.nhap();
        System.out.println(x);
    }
}   

