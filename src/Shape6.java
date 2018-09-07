/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Shape6 {
    public static void main(String[] args) {
        ColorTriangle c1 = new ColorTriangle("red","empty",8.0,9.0);
        System.out.println("thong tin c1:");
        c1.showDim();
        c1.showStyle();
        System.out.println("dien tich c1: "+c1.area());
        c1.showColor();
        
        ColorTriangle c2 = new ColorTriangle("blue","condensed",7.0,6.7);
        System.out.println("thong tin c2:");
        c2.showDim();
        c2.showStyle();
        System.out.println("dien tich c2: "+c2.area());
        c2.showColor();
        
        Triangle t1 = new Triangle("rong",6,8.9);
        Triangle t2 = new Triangle(t1);
         System.out.println("thong tin t1:");
        t1.showDim();
        t1.showStyle();
        System.out.println("dien tich c2: "+t1.area());
        
         System.out.println("thong tin t2:");
        t2.showDim();
        t2.showStyle();
        System.out.println("dien tich c2: "+t2.area());
    }
}
