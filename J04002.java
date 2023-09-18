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
class Rectange{
    double width, height;
    String color;

    public Rectange() {
        height = 1;
        width = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea()
    {
        return width*height;
    }
    public double findPerimeter()
    {
        return 2*(width+height);
    }
    
}
public class J04002 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double width, height;
        String color;
        width = sc.nextDouble();
        height = sc.nextDouble();
        color = sc.next();
        if(width<=0 || height <= 0)
        {
            System.out.println("INVALID");
        }
        else
        {
            Rectange x = new Rectange(width,height,color);
//            x.width = width;
//            x.height = height;
//            x.color = color;
            System.out.println((int)x.findPerimeter()+ " " +(int)x.findArea()+" "+x.getColor());
        }
    }
}
