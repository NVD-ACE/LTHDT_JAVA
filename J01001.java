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
public class J01001 {
    public static void main(String[]  args)
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if(x<=0||y<=0)
        {
            System.out.println(0);
        }
        else
        {
            long cv = 2*(x+y);
            long dt = x*y;
            System.out.println(cv + " " + dt);
        }
    }
}
