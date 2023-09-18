/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author dungn
 */
public class J01008 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        int test = 1;
        while(t>0)
        {
            int n = sc.nextInt();
            System.out.print("Test "+ test +": ");
            for(int i = 2;i<=sqrt(n);i++)
            {
                int dem=0;
                if(n%i==0)
                {
                    while(n%i==0)
                    {
                        dem++;
                        n=n/i;
                    }
                    System.out.print(i + "(" + dem +") ");
                }
            }
            if(n>1)
            {
                System.out.print(n + "(" + 1 +")");
            }
            System.out.println();
            test++;
            t--;
        }
    }
}
