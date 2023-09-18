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
public class J01006 {
    public static Scanner sc = new Scanner(System.in);
    public static long a[]  =  new long[100];
    public static void FiBo()
    {
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for(int i = 3;i<=92;i++)
            a[i]=a[i-1]+a[i-2];
    }
    public static void main(String[] args)
    {
        int t;
        t = sc.nextInt();
        FiBo();
        while(t>0)
        {
            int n;
            n = sc.nextInt();
            System.out.println(a[n]);
            t--;
        }
    }
}
