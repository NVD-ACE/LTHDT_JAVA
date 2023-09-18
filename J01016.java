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
public class J01016 {
    public static int check(String s)
    {
        int dem = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='4'||s.charAt(i)=='7')
            {
                dem+=1;
            }
        }
        if(dem==4||dem==7)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
