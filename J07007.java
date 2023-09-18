/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author dungn
 */
class WordSet{
    public Set<String> a;
     public WordSet(String FileName) throws FileNotFoundException
    {
        File f = new File("VANBAN.in");
        Scanner ReadFile = new Scanner(f);
        a = new TreeSet<>();
        while(ReadFile.hasNext())
        {
            String s = ReadFile.next().toLowerCase();
            a.add(s);
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (String i: a)
        {
            res+= i + "\n";
        }
        return res;
    }
     
}
public class J07007 {
//    public static void main(String[] args) throws FileNotFoundException{
//        File f = new File("src/CodePtit/DATA");
//        Scanner ReadFile = new Scanner(f);
//        Set<String> a;
//        a = new TreeSet<>();
//        while(ReadFile.hasNext())
//        {
//            String s = ReadFile.next().toLowerCase();
//            a.add(s);
//        }
//        for(String i:a)
//        {
//            System.out.println(i);
//        }
//        ReadFile.close();
//    }
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
