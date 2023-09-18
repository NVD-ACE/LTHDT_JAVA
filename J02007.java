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
public class J02007 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n;
            n = sc.nextInt();
            int []a = new int[n];
            int []c = new int[100005];
            for(int i =0;i<n;i++)
            {
                a[i] = sc.nextInt();
                c[a[i]]++;
            }
            System.out.println("Test "+ j +":");
            for(int i=0;i<n;i++)
            {
                if(c[a[i]]!=0){
                    System.out.println(a[i]+" xuat hien " + c[a[i]] + " lan");
                    c[a[i]] = 0;
                }
            }
        }
    }
}
