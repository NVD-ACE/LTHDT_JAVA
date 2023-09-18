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
class NhanVien{
    public static Scanner sc = new Scanner(System.in);
    private String ma,ten,gt,ns,dc,code,ngs;
    public NhanVien() {
    }
    public void nhap()
    {
        ma = "00001";
        ten = sc.nextLine();
        gt = sc.nextLine();
        ns = sc.nextLine();
        dc = sc.nextLine();
        code = sc.nextLine();
        ngs = sc.nextLine();
    }

    @Override
    public String toString() {
        return ma + " " +ten + " " +gt+ " " +ns+ " " +dc+ " " +code+ " " +ngs;
    }
    
}
public class J04007 {
    public static void main(String[] args)
    {
        NhanVien x = new NhanVien();
        x.nhap();
        System.out.println(x);
    }
}
