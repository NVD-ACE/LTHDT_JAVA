/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import static java.lang.Math.max;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dungn
 */
public class J01025 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[4];
        int [] b = new int[4];
        for(int i=0;i<4;i++)
        {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int x = max(a[3]-a[0],b[3]-b[0]);
        System.out.println(x*x);
    }
}
