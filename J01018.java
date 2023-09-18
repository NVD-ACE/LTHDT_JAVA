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
public class J01018 {
    public static int check(String s)
    {
        int sum = s.charAt(0)-'0';
        for(int i=1;i<s.length();i++)
        {
            if(abs((int)s.charAt(i)-(int)s.charAt(i-1))!=2)
            {
                return 0;
            }
            sum = sum + s.charAt(i)-'0';
        }
        if(sum%10==0)
        {
            return 1;
        }
        return 0;
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
            t-=1;
        }
        
    }
}
