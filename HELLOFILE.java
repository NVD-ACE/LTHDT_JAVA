/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author dungn
 */
public class HELLOFILE {
    public static void main(String[] args)
    {
        //duong dan toi
        String filePath = "Hello.txt";
        try
        {
            //mo file de doc
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            // doc tuong dong in ra man hinh
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //dong file sau khi doc
            reader.close();
        }
        catch(IOException e)
        {
            System.err.println("Loi khi doc file: " + e.getMessage());
        }
    }
}
