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
public class J01010 {
    public static Scanner sc = new Scanner(System.in);
    public static long catdoi (String s)
    {
        long n = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '0'||s.charAt(i) == '8'||s.charAt(i) == '9')
            {
                n = n*10;
            }
            else if(s.charAt(i)=='1')
            {
                n = n*10+1;
            }
            else
            {
                return 0;
            }
        }
        return n;
    }
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.next();
            long kq = catdoi(s);
            if(kq==0)
            {
                System.out.println("INVALID");
            }
            else
                System.out.println(kq);
            t--;
        }
    }
}
