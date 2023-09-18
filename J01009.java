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
public class J01009 {
    public static Scanner sc = new Scanner(System.in);
    public static long gt(int n)
    {
        long tmp = 1, res =0;
        for(int i=1;i<=n;i++)
        {
            tmp*=i;
            res+=tmp;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        System.out.println(gt(n));
    }
}
