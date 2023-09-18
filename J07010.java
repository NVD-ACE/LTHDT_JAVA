/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author dungn
 */
class SinhVien{
    private String code,name,group,dob;
    private float GPA;

    public SinhVien(String code, String name, String group, String dob, float GPA) throws ParseException {
        this.code = code;
        this.name = name;
        this.group = group;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.dob = formatter.format(formatter.parse(dob));
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + group + " " + dob + " " + String.format("%.2f", GPA);
    }
    
}
public class J07010 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException
    {
        File f = new File("SV.in");
        Scanner Read_File = new Scanner(f);
        int k = Integer.parseInt(Read_File.nextLine());
        for(int i=1;i<=k;i++)
        {
            String code = "B20DCCN" + String.format("%03d",i);
            String name = Read_File.nextLine();
            String group = Read_File.nextLine();
            String dob = Read_File.nextLine();
            float GPA = Float.parseFloat(Read_File.nextLine());
            SinhVien x = new SinhVien(code,name,group,dob,GPA);
            System.out.println(x);
        }
        Read_File.close();
    }
}
