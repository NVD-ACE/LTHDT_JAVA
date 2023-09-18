/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author dungn
 */
public class J02009 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []T = new int[n];
        int []D = new int[n];
        for(int i=0;i<n;i++)
        {
            T[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(T[i]>=T[j])
                {
                    int r1 = T[i];
                    T[i] = T[j];
                    T[j] = r1;
                    int r2 = D[i];
                    D[i] = D[j];
                    D[j] = r2;
                }
            }
        }
        int time = T[0];
        for(int i=1;i<n;i++)
        {
            time = max(time+D[i-1],T[i]);
        }
        System.out.println(time+D[n-1]);
    }
}
