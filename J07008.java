/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungn
 */
public class J07008 {
    public static List<String> str = new ArrayList<>();
    public static int[] c = new int[25];
    public static void print(int a[],int n,int [] b)
    {
        String tmp = "";
        int d = 0;
        for(int i=1;i<=n;i++)
        {
            //tmp += Integer.toString(a[i]) + " ";
            if(a[i] == 1)
            {
                c[d] = b[i-1];
                d++;
            }
        }
        if(d > 1)
        {
            tmp += c[0] + " ";
            for(int i=1;i<d;i++)
            {
                if(c[i]<c[i-1])
                {
                    return;
                }
                tmp += Integer.toString(c[i]) + " ";
            }
        }
        if(!tmp.isEmpty())
        {
            str.add(tmp);
        }
    }
    public static void Try(int [] a, int n,int i,int [] b)
    {
        for(int j=0;j<=1;j++)
        {
            a[i] = j;
            if(i == n)
            {
                print(a,n,b);
            }
            else {
                Try(a,n,i+1,b);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        FileInputStream  f = new FileInputStream("TEXT.txt");
        Scanner Read_f = new Scanner(f);
        int n;
        int [] b = new int[25];
        int [] a = new int[25];
        n = Integer.parseInt(Read_f.nextLine());
        while(Read_f.hasNextInt())
        {
            for(int i =0;i<n;i++)
            {
                a[i] = Read_f.nextInt();
            }
//            System.out.println(n);
//            for(int i =0;i<n;i++)
//            {
//                System.out.print(a[i]+" ");
//            }
        }
        Try(b,n,1,a);
        Collections.sort(str);
        for(String w: str)
        {
            System.out.println(w);
        }
        Read_f.close();
    }
}
