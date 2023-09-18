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
public class J02006 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        int []c = new int[1005];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            c[a[i]] = 1;
        }
        for(int j=0;j<m;j++)
        {
            b[j] = sc.nextInt();
            c[b[j]] = 1;
        }
        for(int i=1;i<1000;i++)
        {
            if(c[i]==1)
            {
                System.out.print(i + " ");
            }
        }
    }
}
