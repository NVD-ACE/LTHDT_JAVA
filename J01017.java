/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author dungn
 */
public class J01017 {
    public static int check(String s)
    {
        for(int i=1;i<s.length();i++)
        {
            if(abs((int)s.charAt(i)-(int)s.charAt(i-1))!=1)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.next();
            if(check(s)==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t = t-1;
        }
    }
}
