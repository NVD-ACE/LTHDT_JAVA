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
class ThiSinh {
    private String name, year;
    private float d1,d2,d3;
    public static Scanner sc = new Scanner(System.in);
    public ThiSinh() {
    }
    public void nhap()
    {
        name = sc.nextLine();
        year = sc.next();
        d1 = sc.nextFloat();
        d2 = sc.nextFloat();
        d3 = sc.nextFloat();
    }
    @Override
    public String toString() {
        return name +" "+ year+ " " + String.format("%.1f", d1+d2+d3);
    }
    
    
}
public class J04005 {
    public static void main(String[] args)
    {
        ThiSinh a = new ThiSinh();
        a.nhap();
        System.out.println(a);
    }
}
