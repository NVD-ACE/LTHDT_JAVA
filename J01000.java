/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author dungn
 */
public class J01000 {
    public static String remove2(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty() && st.peek()==s.charAt(i))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        String result = "";
        while(!st.isEmpty())
        {
            result = st.pop() + result;
        }
        if(result.length()!=0)
        {
            return result;
        }
        else
        {
            return "Empty String";
        }
    }
    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       System.out.println(remove2(s));
   }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        String result = removeDuplicates(input);
//        System.out.println(result);
//
//        scanner.close();
//    }
//
//    public static String removeDuplicates(String s) {
//        Stack<Character> stack = new Stack<>();
//        
//        for (char c : s.toCharArray()) {
//            if (!stack.isEmpty() && stack.peek() == c) {
//                stack.pop(); // Nếu gặp kí tự trùng với kí tự ở đỉnh stack, loại bỏ kí tự ở đỉnh stack
//            } else {
//                stack.push(c); // Ngược lại, thêm kí tự vào đỉnh stack
//            }
//        }
//
//        // Xây dựng xâu kết quả từ nội dung của stack
//        StringBuilder result = new StringBuilder();
//        while (!stack.isEmpty()) {
//            result.insert(0, stack.pop());
//        }
//
//        if (result.length() == 0) {
//            return "Empty String";
//        } else {
//            return result.toString();
//        }
//    }
}
//public static int n;
//    public static int[] a = new int[10];
//    public static boolean[] c = new boolean[10];
//    public static void print() {
//        for (int i = 1; i < n; i++) {
//            if (Math.abs(a[i] - a[i + 1]) == 1) {
//                return;
//            }
//        }
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a[i]);
//        }
//        System.out.println();
//    }
//    public static void Try(int i) {
//        for (int j = 1; j <= n; j++) {
//            if (c[j] == false) {
//                c[j] = true;
//                a[i] = j;
//                if (i == n) {
//                    print();
//                } else {
//                    Try(i + 1);
//                }
//                c[j] = false;
//            }
//        }
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0)
//        {
//            n = sc.nextInt();
//            Try(1);
//        }
//    }