/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author dungn
 */
class SinhVien{
    private String SV = "B20DCCN001";
    private String name,lop,ngs;
    private float diem;
    public SinhVien(String name, String lop, String ngs, float diem) throws ParseException {
        this.name = name;
        this.lop = lop;
        SimpleDateFormat x = new SimpleDateFormat("dd/mm/yyyy");
        this.ngs = x.format(x.parse(ngs));
        this.diem = diem;
    }
    
    @Override
    public String toString() {
        return SV + " " + name + " " + lop + " " + ngs + " " + String.format("%.2f", diem);
    }
}
public class J04006 {
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.next();
        String ngs = sc.next();
        Float diem = sc.nextFloat();
        SinhVien a = new SinhVien(name,lop,ngs,diem);
        System.out.println(a);
    }
}
