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
public class J02004 {
    public static Scanner sc = new Scanner(System.in);
    public static int check(int [] a,int n)
    {
        int l = 0, r= n-1;
        while(l<=r)
        {
            if(a[l]!=a[r]){
                return 0;
            }
            l = l+1;
            r = r-1;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int [] a= new int[n];
            for(int i =0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            if(check(a,n)==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
