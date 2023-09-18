/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author dungn
 */

public class TH {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            List<Long> list = new ArrayList<>();
            HashMap<Long, Integer> mp = new HashMap<>();
            int n = in.nextInt(), ok = 0;
            for(int i = 0; i < n; i++){
                long x = in.nextLong();
                list.add(x * x);
                if(mp.containsKey(x * x)){
                    mp.replace(x * x, mp.get(x * x) + 1);
                }
                else{
                    mp.put(x * x, 1);
                }
            }
            Collections.sort(list);
            for(int i = 0; i < n - 2; i++){
                for(int j = i + 1; j < n - 1; j++){
                    if(mp.containsKey(list.get(i) + list.get(j))){
                        ok = 1;
                        break;
                    }
                }
            }
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt(), ok = 0;
//            long[] a = new long[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextLong();
//            }
//            Arrays.sort(a);
//            for (int i = 0; i < n; i++) {
//                for (int j = i + 1; j < n; j++) {
//                    long k = (long) Math.sqrt(a[i] * a[i] + a[j] * a[j]);
//                    if (k * k != a[i] * a[i] + a[j] * a[j]) {
//                        break;
//                    }
//                    if (Arrays.binarySearch(a, k) > j) {
//                        ok = 1;
//                        break;
//                    }
//                }
//            }
//            System.out.println(ok == 1 ? "YES" : "NO");
//        }
//        sc.close();
//    }
//}