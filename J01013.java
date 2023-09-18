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
public class J01013 {
    public static final int N = (int) 2e6;
    public static int[] prime = new int[N+5];
    // tìm số nguyên tố nhỏ nhất của các số
    public static void snt()
    {
        for(int i=2;i*i<=N;i++)
        {
            if(prime[i]==0)
            {
                for(int j=i;j<=N;j+=i)
                {
                    if(prime[j]==0)
                    {
                        prime[j] = i;
                    }
                }
          
            }
        }
        for(int i=2;i<=N;i++)
        {
            if(prime[i]==0)
            {
                prime[i]=i;
            }
        }
    }
    public static int kq(int n)
    {
        if(prime[n]==0)
        {
            return n;
        }
        int sum =0;
        while(n!=1)
        {
            sum+=prime[n];
            n=n/prime[n];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        snt();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum =0;
        for(int i =0 ;i < t ;i++)
        {
            int x = sc.nextInt();
            sum+=kq(x);
        }
        System.out.println(sum);
    }
}
