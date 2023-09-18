/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.Scanner;
//import java.io.FileNotFoundException;
/**
 *
 * @author dungn
 */
class Pair<K,V>{
    private int K;
    private int V;

    public Pair(int K, int V) {
        this.K = K;
        this.V = V;
    }
    public boolean snt(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime()
    {
        if(snt(K) && snt(V))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return K + " " + V;
    }
    
}
public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
